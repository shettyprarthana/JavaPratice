package Skillary;
/*open the browser, enter skillary.com, click on Gear tab
 * click on skillary demo app, mouse hover to course tab, select selenium training
 * double click on +button, click on Add to cart
 * Handle alert popup, close the browser
 */
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/descendant::a[contains(text(),' SkillRary Demo APP')]")).click();
		
		//switch to child browser
		String parentID= driver.getWindowHandle();
		Set<String> ids= driver.getWindowHandles();
		for (String id : ids) {
			driver.switchTo().window(id);
		}
		//mouse hover action
		Actions action=new Actions(driver);
		WebElement courseMoveHover = driver.findElement(By.id("course"));
		action.moveToElement(courseMoveHover).perform();
		
		driver.findElement(By.xpath("//span[@class='wrappers']/a[contains(text(),'Selenium Training')]")).click();
		
		//doubleClick action
		WebElement plusButton = driver.findElement(By.id("add"));
		action.doubleClick(plusButton).perform();
		
		driver.findElement(By.xpath("//button[contains(text(),' Add to Cart')]")).submit();
		Thread.sleep(2000);
		
		//alert notification
		Alert al= driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		driver.close(); //closes the child browser
		//switch to parent browser
		driver.switchTo().window(parentID);
	}
}
