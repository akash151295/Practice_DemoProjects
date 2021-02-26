package Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;

public class driverOpen {
	
	WebDriver driver;
	
	loginpage login;
	
	public void open_Chrome_Browser() {
		login = new loginpage(driver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.navigate().to("https://example.testproject.io/web/");
	}

}
