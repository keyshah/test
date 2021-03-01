package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Test1");
	}

	@When("user enters user and pwd")
	public void user_enters_user_and_pwd() {
		System.out.println("Test2");
	
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Test3");
		
	}

	@Then("User is navigated to my account")
	public void user_is_navigated_to_my_account() {
		System.out.println("Test4");
		
	}

}
