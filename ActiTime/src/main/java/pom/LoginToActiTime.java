package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToActiTime {
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;
   
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement clickToLogin;
	
	@FindBy(xpath="//div[@id='keepLoggedInCheckBoxContainer']")
	private WebElement clickToCheckBox;
	
	public LoginToActiTime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//driver123=driver=ChromeDriver()
	}
	public void enterUserName(String userId) {
		userName.sendKeys(userId);	
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public String getTextFromLoginButton() {
		String text=clickToLogin.getText();
		return text;
	}
	public void clickOnLoginButton() {
		clickToLogin.click();;
	}
	public void clickToCheckBox() {
		clickToCheckBox.click();
	}
	
	
	public void loginApplication() {
		userName.sendKeys("admin");
		password.sendKeys("manger");
		clickToLogin.click();
		clickToCheckBox.click();
		
		
		
		
		
		
		
		
		
		
	}
	}