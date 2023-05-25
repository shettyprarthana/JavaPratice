package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActitimeLoginScripts {
public static void main(String[] args) {
	ActitimeLoginScripts act= new ActitimeLoginScripts();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(act.readDataFromProperties("url"));
	
	long time= Long.parseLong(act.readDataFromProperties("timeouts"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
	String username=act.readDataFromProperties("UN");
	String pwd=act.readDataFromProperties("PWD");
	
	driver.findElement(By.id("username")).sendKeys(username+Keys.TAB+pwd+Keys.ENTER);
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	boolean status=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	if(status)
		System.out.println("pass");
	else
		System.out.println("fail");
	driver.quit();
}
//generic method to read properties file
public String readDataFromProperties(String key)
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
