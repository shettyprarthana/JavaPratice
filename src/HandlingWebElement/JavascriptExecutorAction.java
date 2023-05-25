package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExecutorAction {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//step1: Typecast WebDriver reference to javascriptExecutor reference
		JavascriptExecutor js= (JavascriptExecutor)driver;  
		//navigate to url
		js.executeScript("window.location=arguments[0]", "https://www.ebay.com/");
		
		//to get title and url
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		//passing data into search field
		WebElement searchTF = driver.findElement(By.id("gh-ac"));
		js.executeScript("arguments[0].value=arguments[1]", searchTF,"smart tv");
		//click on search button
		WebElement searchButton = driver.findElement(By.id("gh-btn"));
		js.executeScript("arguments[0].click()", searchButton);
		
		driver.quit();
	}
}
