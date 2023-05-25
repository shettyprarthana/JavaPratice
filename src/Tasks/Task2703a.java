package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2703a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.linkText("Return to login page")).click();
		
	}

}
