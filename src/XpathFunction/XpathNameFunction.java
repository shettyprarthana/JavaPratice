package XpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathNameFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg'][@id='Layer_1']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}	
}
