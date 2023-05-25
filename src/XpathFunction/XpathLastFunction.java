package XpathFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLastFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='rankings-card__view-link']/a")).click();
		String name=driver.findElement(By.xpath("//table/tbody/tr[last()]/child::td[contains(@class,'name')]")).getText();
		Thread.sleep(2000);
		System.out.println(name);
		driver.close();
		
	}	
}
