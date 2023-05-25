package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ClassNamePractice1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com/");
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("watches");
		Thread.sleep(2000);
		
		driver.findElement(By.className("gh-spr")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
}

