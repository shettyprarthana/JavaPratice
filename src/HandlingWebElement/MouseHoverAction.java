package HandlingWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab= driver.findElement(By.id("course"));
		Actions actions= new Actions(driver);
		actions.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='manual testing']")).click();
		WebElement header=driver.findElement(By.xpath("//h1[@class='page-header']"));
		if(header.getText().equalsIgnoreCase("manual testing"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Fail");
		
		driver.close();
	}
}
