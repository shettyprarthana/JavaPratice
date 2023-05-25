package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*scenario
 * open the browser, enter the facebook.com, click on 'Forgotten Password?' link
 * type invalid number
 * clear it and type the valid number
 * click on search button
 * close the browser
 */
public class ClearAndSubmitPratice {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Forgotten password?")).click();
		WebElement ele = driver.findElement(By.id("identify_email"));
		ele.sendKeys("fdfdffffff");
		ele.clear();
		ele.sendKeys("dsdf@gmail.com");
		driver.findElement(By.id("did_submit")).submit();
		driver.close();

	}
}