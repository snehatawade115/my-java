package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginToActiTime;
import pom.LoginToHeders;

public class TestLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AASHU\\Documents\\sonna\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginToActiTime login= new LoginToActiTime(driver);//driver123=driver=Chromedriver()
		String loginText=login.getTextFromLoginButton();
		if(loginText.equals("Login"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		//Thread.sleep(2000);
		login.enterUserName("admin");
		login.enterPassword("manager");
		login.clickToCheckBox();
		login.clickOnLoginButton();
		
		LoginToHeders loginToHeders=new LoginToHeders(driver);
		loginToHeders.clickOnTimeTrack();
		loginToHeders.clickOnTask();
		loginToHeders.clickOnReport();
		loginToHeders.ClickOnLogout();
		
	}

}
