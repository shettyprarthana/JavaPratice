package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesChildParent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li/a[@href='product.php?product=selenium-training']")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//h1/parent::div/child::h3/child::b")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		
		driver.close();
		
	}
}
