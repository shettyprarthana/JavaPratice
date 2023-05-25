package basics;
/*Scenario: open the browser, enter instagram.com click on forgot password link, close the browser*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
	}
