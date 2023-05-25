package basics;
/* //div[text()='APPLE iPhone 14 (Purple, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']
 * 
 * search for iphone and get the price*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesAncestorDescendant {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys("iphones");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			String price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Purple, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			//Thread.sleep(2000);
			System.out.println(price);
			//Thread.sleep(2000);
			driver.close();
}
}
