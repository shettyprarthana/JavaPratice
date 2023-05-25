package basics;
import java.util.List;

/*open the browser, enter flipkart, they iphones in search text field, click on search button
 * fetch all the iphones names and print in the console
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classNamePratice2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Thread.sleep(3000);
		//pop up to close
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
		//to search the products
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(3000);
		//to save all iphones with className=_4rR01T
		List<WebElement> phoneNames = driver.findElements(By.className("_4rR01T"));
		for (WebElement name: phoneNames)
		{
			String text= name.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		driver.close();
		
	}
}
