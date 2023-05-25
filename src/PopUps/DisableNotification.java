package PopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--disable-notifications"); //to disable show notification
		options.addArguments("--disable-geolocation");   //to disable geolocation notification
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	//	driver.get("https://www.yatra.com/");
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
