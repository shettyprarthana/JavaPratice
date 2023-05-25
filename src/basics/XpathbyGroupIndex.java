package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyGroupIndex {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.findElement(By.xpath("(//a[contains(text(),'Take product tour')])[1]")).click();
		Thread.sleep(2000);
		driver.close();
}
}
