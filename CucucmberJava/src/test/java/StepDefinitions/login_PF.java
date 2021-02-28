package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Drivers.driverOpen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;
import pages.loginpage_PF;

public class login_PF {

	WebDriver driver = null;
	loginpage_PF login;
	
	@Given("User is at login page")
	public void user_is_at_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		login = new loginpage_PF(driver);	
		login.open_Chrome_Browser();
	    

	}
	@When("^User enter (.*) and (.*)$")
	public void user_enter_Username_and_Password(String Username, String Password) {
			
		login.enter_UsernameAndPassword_login(Username, Password);

	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.click_On_LoginButton();

	}
	@Then("User should navigates to login page")
	public void user_should_navigates_to_login_page() throws InterruptedException {
		login.validate_Valid_Response();
		login.browser_Close();
	}
	@Then("User should not navigates to login page")
	public void user_should_not_navigates_to_login_page() throws InterruptedException {
		login.validate_Invalid_Response();
		login.browser_Close();
	}
}
