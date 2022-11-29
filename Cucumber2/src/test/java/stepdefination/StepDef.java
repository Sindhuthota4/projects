package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {


		@Given("login page")
		public void login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("user enter to login page");
		   
		}

		@When("user enters email {string} and password {string}")
		public void user_enters_email_and_password(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("username:"+string+" password:"+string2);
		}

		@When("click on login")
		public void click_on_login() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("when click on login");
		}

		@Then("user enters to home page")
		public void user_enters_to_home_page() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("enters to mail home ");
		}


}
