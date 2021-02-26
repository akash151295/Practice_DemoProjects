package StepDefinitionsforBackground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage_PF;

public class login_Background {

	@Given("User is at login page")
	public void user_is_at_login_page() {
	   
	}
	@When("User enters UN and Pwd")
	public void user_enters_un_and_pwd() {
	    
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}
	@Then("User should navigates to homepage")
	public void user_should_navigates_to_homepage() {
	    
	}
	
	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() {

	}
	
	@Then("User should be able to logout")
	public void user_should_be_able_to_logout() {

	}

	@When("User clicks on sorting option")
	public void user_clicks_on_sorting_option() {
	    
	}
	@Then("Sorting should be working fine")
	public void sorting_should_be_working_fine() {
	    
	}

}
