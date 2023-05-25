package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyTraversing2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("_2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("headphones");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		//String text= driver.findElement(By.xpath("//a[text()='Boult Audio Gearpods with 32H Playtime, Fast Charging, ...']/../div/../div[3]/span/div")).getText();
		String text= driver.findElement(By.xpath("//a[text()='Boult Audio Gearpods with 32H Playtime, Fast Charging, ...']/../div/span/div[@class='_3LWZlK']")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		driver.close();
		
}
}
