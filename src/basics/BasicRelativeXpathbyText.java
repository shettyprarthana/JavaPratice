package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathbyText {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();
		driver.findElement(By.xpath("//span[@class='linkTest' and text()='Sports Shoes']")).click();
		Thread.sleep(2000);
		driver.close();
}
}
