package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {

	WebDriver driver;

	By txt_Username_login = By.xpath("//input[@id='name']");
	By txt_Password_login = By.xpath("//input[@id='password']");
	By btn_Login_login = By.xpath("//button[@id='login']");

	public loginpage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("TestProjectDemo")) {
			System.out.println("You are on wrong page. Current page is= "+driver.getCurrentUrl());
		}
	}
	
	public void open_Chrome_Browser() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	public void enterUsername(String Username) {

		driver.findElement(txt_Username_login).sendKeys(Username);
	}

	public void enterPassword(String Password) {

		driver.findElement(txt_Password_login).sendKeys(Password);
	}

	public void clickLogin() {

		driver.findElement(btn_Login_login).click();
	}

	public void loginValidUser(String Username, String Password) {

		driver.findElement(txt_Username_login).sendKeys(Username);
		driver.findElement(txt_Password_login).sendKeys(Password);
	}

	public void validateAlertOnLogin() throws InterruptedException {
		String Actual = driver.findElement(By.xpath("//div[text()='Password is invalid']")).getText();
		String Expected = "Password is invalid";
		System.out.println("Actual"+driver.getTitle());
		assertEquals(Expected, Actual);
		Thread.sleep(1500);

	}

	public void validatePageTitle() {
		String Expected = "TestProject Demo";
		System.out.println("Actual"+driver.getTitle());
		assertEquals(Expected,driver.getTitle());


	}

	public void browserClose() {
		driver.close();
	}
}
