package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* //ul[contains(@class,'featured-athletes')]/descendant::span[contains(@class,'result-medal--gold')]
 */// search satic ele first 
 //span[text()='mikaela SHIFFRIN']/ancestor::li/descendant::span[contains(@class,'gold')]
//a[contains(@class,'featured-athlete__name')]/span[text()='Mikaela SHIFFRIN']/ancestor::li/descendant::span[contains(@class,'gold')]
 // https://olympics.com/
 //go to featured-athletes and get gold medal
 //
public class XpathAxesAncDescendant {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/");
		Thread.sleep(2000);
	String count=driver.findElement(By.xpath("//a[contains(@class,'featured-athlete__name')]/span[text()='Mikaela SHIFFRIN']/ancestor::li/descendant::span[contains(@class,'gold')]")).getText();
System.out.println(count);
driver.close();
	}
}
