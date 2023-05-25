package XpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathNormalizeSpaceFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Products']")).click();
		//driver.findElement(By.xpath("//a[normalize-space(text()='Products')]")).click(); //wrong syntax
		
		driver.close();
		
	}	
}
