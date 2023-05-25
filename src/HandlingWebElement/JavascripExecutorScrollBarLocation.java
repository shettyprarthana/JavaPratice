package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascripExecutorScrollBarLocation {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Restaurants')]"));
				Point location =element.getLocation();
				int x= location.getX();
				int y= location.getY();
				
		//step1: Typecast WebDriver reference to javascriptExecutor reference
		JavascriptExecutor js= (JavascriptExecutor)driver;  
		//step2:using javascriptExecutor ref call the method executeScript()
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		driver.quit();
	}
}
