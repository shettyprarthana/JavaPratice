package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * //a[text()='Rishabh Pant']/parent::td/following-sibling::td[contains(@class, 'rating')]
 *
 * icc criket view rank
 */
public class XpathAxesSibling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/");
		Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='rankings-card__view-link']/a[contains(@title,'Full Rankings')]")).click();
String rating=driver.findElement(By.xpath("//a[text()='Rishabh Pant']/parent::td/following-sibling::td[contains(@class,'rating')]")).getText();
	System.out.println(rating);
	driver.close();
	}
}
