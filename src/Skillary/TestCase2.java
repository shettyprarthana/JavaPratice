package Skillary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*open the browser, enter skillary.com, click on Gear tab
 * click on skillary demo app, select testing from category dropdown
 * drag and drop C to my cart
 * scroll the page till facebook icon and click on facebook icon
 *  close the browser
 */
public class TestCase2 {
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
		//select from dropdown
		WebElement staticDd = driver.findElement(By.name("addresstype"));
		Select s=new Select(staticDd);
		s.selectByValue("category.php?category=testing");
		
		//drag and drop
		Actions actions= new Actions(driver);
		 WebElement imgC = driver.findElement(By.id("C"));
		 WebElement myCart = driver.findElement(By.id("cartArea"));
		actions.dragAndDrop(imgC,myCart).perform();
		
		//scroll to facebook icon
		WebElement fbIcon = driver.findElement(By.xpath("(//ul[@class='list-socialicons']/li/a)[2]"));
		Point loc=fbIcon.getLocation();
		int x= loc.getX();
		int y=loc.getY();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		//click on facebook icon
		js.executeScript("arguments[0].click()", fbIcon);
		Thread.sleep(3000);
		driver.quit();
	}
}
