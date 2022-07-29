package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


public class stepDefinition {
	
	@Given("^User is on netbanking landing page$")
	public void launch_net_banking() {
		System.out.println("Net Banking Launched");
	}
	
	@When("^User login into application with username and password$")
	public void login() {
		System.out.println("Logged in");
	}
	
	@Then("^Home page is displayed$")
	public void validate_home_page() {
		System.out.println("Home Page is displayed");
	}
	
	 @And("^Cards displayed is \"([^\"]*)\"$")
	    public void cards_displayed_is_something(String strCardFlag) throws Throwable {
	       System.out.println("card display validation - "+ strCardFlag);
	    }
	
	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login(String uName, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user- '"+ uName + "' logged in successfully");;
	}
	
	 @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		 List<List<String>> lst = data.asLists();
		 for (int i = 0; i < lst.get(0).size(); i++) {
			System.out.println(lst.get(0).get(i));
		 }
	    }
	 
	 @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
	        System.out.println("username -" + username);
	        System.out.println("password -" + password);
	    }
	 
	 @Given("^Driver is configured$")
	 public void driver_is_configured() {
		 System.out.println("Configured the driver");
	 }
	 
	 @Given("^User is on Mobile landing page$")
	    public void user_is_on_mobile_landing_page() throws Throwable {
	        System.out.println("User is on mobile landing page now");
	    }
	 
	 @Then("^Mobile Home page is displayed$")
	 public void mobile_home_page_is_displayed() throws Throwable {
	        System.out.println("Mobile home Page Launched");
	    }
	 
	  @When("^\"([^\"]*)\" is launched in browser$")
	    public void something_is_launched_in_browser(String strArg1) throws Throwable {
	        System.out.println(strArg1 + " is launched");
	    }

	   @Then("^Application home page is opened$")
	    public void application_home_page_is_opened() throws Throwable {
	        System.out.println("Home Page Opened");
	    }
}
