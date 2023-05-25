package Synchronization;
/* checkl login button is disabled or not
 * 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitClickable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(login)).click();
			System.out.println("enabled");
		}
		catch(Exception e)
		{
			System.out.println("disabled");
		}
		driver.findElement(By.name("username")).sendKeys("hjdsdjhmnns");
		driver.findElement(By.name("password")).sendKeys("frnjjjeerfef");
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(login)).click();
			System.out.println("enabled");      
		}
		catch(Exception e)
		{
			System.out.println("disabled");
		}
		
	driver.close();	
	}
}
