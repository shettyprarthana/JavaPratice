package WebElement;
/*Scenatio: 
 * open the browser,enter amazon.com
 * type watch in search text field
 * clear the search text field and type headphones
 * click on search,close the browser
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionsMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement searchTf=driver.findElement(By.id("twotabsearchtextbox"));
		searchTf.sendKeys("watches");
		Thread.sleep(2000);
		searchTf.clear();
		Thread.sleep(2000);
		searchTf.sendKeys("headphones");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("headphones"))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.close();
	}
}
