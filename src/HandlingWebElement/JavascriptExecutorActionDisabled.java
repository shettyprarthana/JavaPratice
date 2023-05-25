package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExecutorActionDisabled {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.id("abc")).sendKeys("selenium");
		
		WebElement txt = driver.findElement(By.id("abc"));
		//step1: Typecast WebDriver reference to javascriptExecutor reference
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		
		//handle disabled element
		js.executeScript("arguments[0].value=arguments[1]", txt, "selenium");
		Thread.sleep(2000);
		driver.quit();
}
}
