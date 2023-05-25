package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRealativeXpathbyText2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.findElement(By.xpath("//a[text()='kitchen product']")).click();
		driver.findElement(By.xpath("//p[text()='Nema Knife Sharpner 1 Pcs']")).click();
		Thread.sleep(0);
		driver.close();
}
}
