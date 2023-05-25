package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowManagement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//fullscreen
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
