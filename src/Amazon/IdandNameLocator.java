package Amazon;
/* Scenario:
 * open the browser
 * enter facebook.com
 * enter username and password
 * click on login button
 * close the browser
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdandNameLocator {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			
			driver.findElement(By.id("ap_email")).sendKeys("55666");
			driver.findElement(By.id("continue")).click();
			
			
			driver.close();
			
			
		}
}
