package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascripExecutorScrollBarHardcoded {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step1: Typecast WebDriver reference to javascriptExecutor reference
		JavascriptExecutor js= (JavascriptExecutor)driver;  
		//step2:using javascriptExecutor ref call the method executeScript()
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)"); 
		Thread.sleep(2000);
		driver.quit();
		
	}
}
