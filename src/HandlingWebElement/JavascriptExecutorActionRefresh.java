package HandlingWebElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExecutorActionRefresh {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//step1: Typecast WebDriver reference to javascriptExecutor reference
		JavascriptExecutor js= (JavascriptExecutor)driver;  
		//navigate to url
		js.executeScript("window.location=arguments[0]", "https://www.ebay.com/");
		
		Thread.sleep(20000);
		js.executeScript("history.go(0)");
		Thread.sleep(2000);
		driver.quit();
	}
}
