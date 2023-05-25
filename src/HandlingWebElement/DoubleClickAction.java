package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args)  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab= driver.findElement(By.id("course"));
		Actions actions= new Actions(driver);
		actions.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='manual testing']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		System.out.println("before double click:"+quantity.getAttribute("value"));
		
		WebElement plusButton = driver.findElement(By.id("add"));
		actions.doubleClick(plusButton).perform();
		System.out.println("after double click:"+plusButton.getAttribute("value"));
		
		driver.close();
	}
}
