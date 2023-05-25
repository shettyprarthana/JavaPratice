package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetSizePractice {
	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo = driver.findElement(By.cssSelector("img.fb_logo"));
	Dimension size=logo.getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	driver.quit();
	}
}
