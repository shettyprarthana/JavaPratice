package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

////b[contains(text(),'Bheed')]/preceding::b[contains(text(),'Pathaan')]
public class XpathAxesPreceding {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='nav-menu-item-5615']/a[contains(text(),'Bollywood Box Office')][1]")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//b[contains(text(),'Bheed')]/preceding::b[contains(text(),'Pathaan')]")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		driver.close();
		
		
	}
}
