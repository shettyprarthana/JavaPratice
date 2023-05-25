package basics;
/*incomplete*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* //p[text()='Ruby']/parent::div/child::p/a[text()='API Docs']
 * https://www.selenium.dev/downloads/
 * scroll to ruby and get xpath of api docs 
 */
public class XpathAxesChildParent2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[text()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Ruby']/parent::div/child::P/a[text()='API Docs']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
