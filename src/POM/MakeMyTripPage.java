package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripPage {
	// Declaration
	@FindBy(xpath="//i[contains(@class,'we_close')]")
	private WebElement popupClose;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromlocTF;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement tolocTF;
	
	@FindBy(xpath="//div[contains(@class,'dates')]/descendant::span[text()='Departure']")
	private WebElement depatureDateTF;
	
	@FindBy(xpath="//a[contains(@class,'widgetSearchBtn')]")
	private WebElement searchButton;
	
	// Initialization
	public MakeMyTripPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public void setpopupCloseButton() {
		popupClose.click();
	}
	public void setFromLoc(String fromloc) {
		fromlocTF.sendKeys(fromloc);
}
	public void setToLoc(String toloc) {
		tolocTF.sendKeys(toloc);
}
	
	public void clicksearchButton() {
		searchButton.click();
}
}
