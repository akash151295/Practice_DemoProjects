package StepDefinitionsforHooks;

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

public class login_Hooks {

	WebDriver driver = null;
	loginpage_PF login;
	
	@Before()
	public void chrome_browser_Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@Before()
	public void edge_browser_Setup() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@After()
	public void browser_Close() {

		driver.close();
	}
	
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("*********This is executed Before Step*********");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("*********This is executed After Step*********");
	}

	@Given("User is at login page")
	public void user_is_at_login_page() {
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
	public void user_should_navigates_to_login_page() {
		login.validate_Valid_Response();
	}

	@Then("User should not navigates to login page")
	public void user_should_not_navigates_to_login_page() {
		login.validate_Invalid_Response();
	}


}
