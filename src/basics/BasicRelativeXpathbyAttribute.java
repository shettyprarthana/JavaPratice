package basics;
/*scenario:open browser, enter myntra, ttpe 'watches' in search field
 * click on search button
 * close the browser
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathbyAttribute {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("watches");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		
		if(driver.getTitle().contains("Watches"))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		driver.close();
}	
}
