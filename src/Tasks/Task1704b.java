package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1704b {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement kidHover = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[contains(text(),'Kids')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(kidHover).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='desktop-navBlock']/li/a[contains(text(),'Infant Care')]")).click();
		
		driver.close();
		
	}
}
