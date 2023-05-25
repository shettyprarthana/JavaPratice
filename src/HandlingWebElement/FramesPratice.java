package HandlingWebElement;
/*scenario:
 * mouse over to signin , click on login, pass the phone number and close it
 * search for shoes and click on search then close it
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FramesPratice {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		//driver.findElement(By.id("pushDenied")).click();
		WebElement signIn = driver.findElement(By.className("accountUserName"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		//frame by index
		//driver.switchTo().frame(0);
		//frame by id
		//driver.switchTo().frame("loginIframe"); 
		//frame by frameElement
		WebElement frameElement=driver.findElement(By.cssSelector("iframe#loginIframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("userName")).sendKeys("78462564774");
		driver.findElement(By.className("sd-icon-delete-sign")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Shoes");
		driver.findElement(By.className("searchTextSpan")).click();
		
		
		WebElement header = driver.findElement(By.xpath("//div[@id='searchMessageContainer']/descendant::span"));
		if(header.getText().contains("Shoes"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.close();
	}
}
