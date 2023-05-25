package basics;

/*Scenario: open the browser, enter facebook.com click on forgotton password link, close the browser*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTexrLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com/");
	
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(3000);
	driver.close();
}
}
