package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* //li[contains(@id,'Lenovo')]/descendant::input   id=p_89/Lenovo, i dont want digit so used contains
 * go to amazon, search for laptop and select checkbox lenova under brand category
 * //div[@id='p_89-title']/parent::div/descendant::input  --error
 */
public class XpathAxesAncestorDescendant1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='p_89-title']/parent::div/descendant::i")).click();
		driver.close();
	}
}
