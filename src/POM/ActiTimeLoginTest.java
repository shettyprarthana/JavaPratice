package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginTest {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
    driver.get(readDataFromProperties("url"));
	
	long time= Long.parseLong(readDataFromProperties("timeouts"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
	ActiTimeLoginPage act= new ActiTimeLoginPage(driver);
	
if(act.getLogo().isDisplayed())
	System.out.println("login page displayed");
else System.out.println("login page not found");

act.setUsername(readDataFromProperties("UN"));
act.setPassword(readDataFromProperties("PWD"));
act.selectCheckBox();
act.clickLogin();

WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
boolean status=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
if(status)
	System.out.println("pass");
else
	System.out.println("fail");
driver.quit();
}

public static String readDataFromProperties(String key)
{
	FileInputStream fis=null;
	//to avoid exception everytime, handle with try catch
	try {
		fis=new FileInputStream("./TestResources/data.properties");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties property=new Properties();
	try {
			property.load(fis);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

	return property.getProperty(key);
}
}
  