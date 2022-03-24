package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToHeders {
	
	@FindBy (xpath="(//img[@src='/img/default/pixel.gif?hash=274618146'])[3]")
	private WebElement clickOnTimeTrack;
	
	@FindBy (xpath="(//img[@src='/img/default/pixel.gif?hash=274618146'])[5]")
	private WebElement clickOnTask;

	@FindBy (xpath="(//img[@src='/img/default/pixel.gif?hash=274618146'])[7]")
	private WebElement clickOnReport;
	
	@FindBy (xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	private WebDriver driver;
	private WebDriverWait wait;

	
	public LoginToHeders(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait=new WebDriverWait(driver,20);
			
	}
	
	public void clickOnTimeTrack() {
		//WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(clickOnTimeTrack));
		clickOnTimeTrack.click();
	}
	public void clickOnTask() {
		//WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(clickOnTask));
		clickOnTask.click();
	}
	public void clickOnReport() {
		clickOnReport.click();
	}
	public void ClickOnLogout() {
		logout.click();
	}
	
	public void Headers() {
		clickOnTimeTrack.click();
		clickOnTask.click();
		clickOnReport.click();
		logout.click();
	}
}
