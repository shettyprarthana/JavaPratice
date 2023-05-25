package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2903a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(4000);
		if(driver.getTitle().contains("Enter Time-Track"))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		Thread.sleep(3000);
		driver.close();		
		
	}

}
