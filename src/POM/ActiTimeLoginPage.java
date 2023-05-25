package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	// no main method, since it is encapuslated class
	// Step1: Declaration
	@FindBy(className = "atLogoImg")
	private WebElement logo;

	@FindBy(id = "username")
	private WebElement usernameTF;

	@FindBy(name = "pwd")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedCB;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPwdLink;

	// Step2: Initialization

	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// step3: Utilization
		public WebElement getLogo() {
			return logo;
		}
		public void setUsername(String username) {
			usernameTF.sendKeys(username);
	}
		public void setPassword(String pwd) {
			passwordTF.sendKeys(pwd);
	}
		public void clickLogin() {
			loginButton.click();
	}
		public void selectCheckBox() {
			keepMeLoggedCB.click();
	}
		public void clickForgotPwdLink() {
			forgotPwdLink.click();
	}
		
}
