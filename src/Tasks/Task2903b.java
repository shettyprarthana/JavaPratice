package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2903b {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]")).sendKeys("headphones");
		
		//driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		//driver.findElement(By.cssSelector("button.searchformButton")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
