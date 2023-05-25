package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*////a[text()='Rishabh Pant']/parent::td/parent::tr/child::td[text()='766']
 * //a[text()='Rishabh Pant']/parent::td/parent::tr/child::td[contains(@class, 'rating')]
 * https://www.icc-cricket.com/
 * scroll dowm click on view full ranking
 * 
 */
public class XpathAxesChildParent3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='rankings-card__view-link']/a")).click();
		Thread.sleep(1000);
		String text = driver
				.findElement(By.xpath(
						"//a[text()='Rishabh Pant']/parent::td/parent::tr/child::td[contains(@class, 'rating')]"))
				.getText();
		Thread.sleep(1000);
		System.out.println(text);
		driver.close();
	}
}
