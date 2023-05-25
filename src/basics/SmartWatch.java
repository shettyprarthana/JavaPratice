package basics;

/*incomplete*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmartWatch {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Fitness Tracker')])[15]"));
		Thread.sleep(3000);
		driver.close();

	}
}
