package StepDefinition;

import static org.junit.Assert.fail;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("Browser is opened")
	public void browser_is_opened() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("test1");
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("test2");
	}

	@When("user enters a text on search box")
	public void user_enters_a_text_on_search_box() {
		driver.findElement(By.name("q")).sendKeys("Keyur Shah");
		System.out.println("test3");
	}

	@And("Hit enter")
	public void hit_enter() {
		System.out.println("test4");
//		Actions builder = new Actions(driver);
//		builder.sendKeys(Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is redirected to search detail page")
	public void user_is_redirected_to_search_detail_page() {
		String expected = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[8]/div[2]/div[9]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/h2[1]/span[1]"))
				.getText();
		System.out.println(expected);
		if (expected.contains("Keyur Shah, MD")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			Assert.fail();
		}

		System.out.println("test5");
		driver.quit();
	}

}
