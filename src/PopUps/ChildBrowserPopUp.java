package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopUp {

public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.cssSelector("button._2doB4z")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
	
	//to handle child browser
	String parentID=driver.getWindowHandle();  //return parent window address
	Set<String> ids=driver.getWindowHandles();  //return both parent child window address
	
	for (String id : ids)  //current in parent window
	{
		driver.switchTo().window(id); //child window
	}
	
	String starRating=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Midnight, 128 GB)']/"
			+ "ancestor::div[@class='aMaAEs']/descendant::div[@class='_3LWZlK']")).getText();
	System.out.println(starRating);
	String price=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Midnight, 128 GB)']/"
			+ "ancestor::div[@class='aMaAEs']/descendant::div[@class='_30jeq3 _16Jk6d']")).getText();
	System.out.println(price);
	
	driver.close();  //to close child window
	driver.switchTo().window(parentID);  //to switch back to parent tab
	
			
}
	
}
