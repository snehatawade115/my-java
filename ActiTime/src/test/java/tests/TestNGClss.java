package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.LoginToActiTime;
import pom.LoginToHeders;

public class TestNGClss {
	WebDriver driver;
	LoginToHeders loginToHeders;
	
	@BeforeClass
	public void beforeClassLaunchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.get("http://localhost/login.do");
		LoginToActiTime login= new LoginToActiTime(driver);
		
		login.enterUserName("admin");
		login.enterPassword("manager");
		login.clickToCheckBox();
		login.clickOnLoginButton();
		System.out.println("before class");
	}
	@Test
	public void toVerifyTheTaskButton() {
		System.out.println("vrrify taskButton");
		loginToHeders=new LoginToHeders(driver);
		loginToHeders.clickOnTask();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();		
	}
	@Test
	public void testVerifyUserButton() {
		System.out.println("second test");
	}
	@AfterMethod
	public void logOutFromApplication() {
		System.out.println("logout");
		loginToHeders.ClickOnLogout();
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
		
			
			
}

	
