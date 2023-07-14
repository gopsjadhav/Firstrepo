package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	@FindBy(id="user-name")
	private WebElement Uname;
	
	@FindBy(id="password")
	private WebElement Pass;
	
	@FindBy(id="login-button")
	private WebElement Lbtn;
	
	public LoginPage(WebDriver driver ) {
		
		//PageFactory.initElements(driver,LoginPage.class);
		PageFactory.initElements(driver,this);
		this.driver= driver;
		
	}
	public boolean IsUserNameFieldDisplayed() {
		return Uname.isDisplayed();	
	}
	public boolean IsPassFieldDisplayed() {
		return Pass.isDisplayed();	
	}
	public boolean IsLoginbtnFieldDisplayed() {
		return Lbtn.isDisplayed();	
	}
	public void EnterUserName() {
		Uname.sendKeys("standard_user");		
	}
	public void EnterPass() {
		Pass.sendKeys("secret_sauce");		
	}
	public void clicklogin() {
		Lbtn.click();	
	}
	
	
}
