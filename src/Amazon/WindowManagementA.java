package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowManagementA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
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
