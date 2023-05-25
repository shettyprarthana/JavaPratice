package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTripTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	    driver.get(readDataFromProperties("url"));
		
		long time= Long.parseLong(readDataFromProperties("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		
		MakeMyTripPage mmt= new MakeMyTripPage(driver);
	
		mmt.setpopupCloseButton();
		mmt.setFromLoc(readDataFromProperties("FROMLOC"));
		mmt.setToLoc(readDataFromProperties("TOLOC"));
		mmt.clicksearchButton();
	}
	
	public static String readDataFromProperties(String key)
	{
		FileInputStream fis=null;
		//to avoid exception everytime, handle with try catch
		try {
			fis=new FileInputStream("./TestResources/makeMytrip.properties");
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
	  

