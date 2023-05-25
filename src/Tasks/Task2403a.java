package Tasks;
import org.openqa.selenium.By;
/* open browser, enter google.com
 * type your name in search field and close the browser
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2403a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Prarthana");
		Thread.sleep(3000);
		driver.close();
		
	}

}
