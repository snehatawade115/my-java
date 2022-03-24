package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToGrow {
	@FindBy (xpath= "//span[text()='Login/Register']") 
	private WebElement clickRegistrationbutton;
	
	@FindBy(xpath="//input[@id='login_email1']")
	private WebElement email;
	
	@FindBy (xpath=("//span[@class='absolute-center'])[1]"))
	private WebElement clickOnContinuebutton;
	
	@FindBy (xpath=("//input[@id='login_password1']"))
	private WebElement pass;
	
	@FindBy (xpath="//span[text()='Submit']")
	private WebElement clickOnSubmitButton;
	
	@FindBy(xpath="(//input[@class='otpinput88'])[1]")
	private WebElement putOnValue1;
	
	@FindBy(xpath="(//input[@class='otpinput88'])[1]")
	private WebElement putOnValue2;
	
	@FindBy(xpath="(//input[@class='otpinput88'])[1]")
	private WebElement putOnValue3;
	
	@FindBy(xpath="(//input[@class='otpinput88'])[1]")
	private WebElement putOnValue4;
	
	LoginToGrow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnRegisterbutton() {
		clickRegistrationbutton.click();
	}
	public void email() {
		email.sendKeys("Angelsweet1510@gmail.com");
	}
	public void clickONCOntinuebutton() {
		clickOnContinuebutton.click();
	}
	public void password() {
		pass.sendKeys("Sonna@123");
	}
	public void clickOnSubmitButton() {
		clickOnSubmitButton.click();
	}
	public void putTheValue1() {
		putOnValue1.sendKeys("8");
	}
	public void putTheValue2() {
		putOnValue2.sendKeys("8");
		
	}
	public void putTheValue3() {
		putOnValue3.sendKeys("8");
	}
			
	public void putTheValue4() {
		putOnValue4.sendKeys("8");
		

}
	public void LoginToGrowApplication() {
		
	}
	}
