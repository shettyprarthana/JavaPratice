package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertConfirmationJavascriptPopUps2 {
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("data");
		Thread.sleep(4000);
		al.accept();
		Thread.sleep(2000);
		 
		driver.quit();
		
	}
}
