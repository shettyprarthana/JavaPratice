package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitVisibility {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement header =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String text=wait.until(ExpectedConditions.visibilityOf(header)).getText();
		System.out.println(text);
		driver.close();
		
		
		
	}
}
