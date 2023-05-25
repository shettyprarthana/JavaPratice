package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*scenario:
 * open the browser
 * enter demo.actitime.com
 * enter username="admin" and password="manager"
 * click on login
 * validate the home page
 * close the browser
 */
public class WebDriverWaitTitle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean status=wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
	if(status)
		System.out.println("test pass");
	else
		System.out.println("test fail");
	driver.close();
	}
}
