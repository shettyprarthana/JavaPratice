package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Scenario:
 * open the browser
 * enter facebook.com
 * enter username and password
 * click on login button
 * close the browser
 */

public class IdAndNameLocatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("55666");
		driver.findElement(By.id("pass")).sendKeys("6535767");
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
	}

}
