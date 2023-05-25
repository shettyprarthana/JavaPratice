package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task0704a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.findElement(By.xpath("(//button[contains(text(),'Rankings')])[1]")).click();
		driver.findElement(By.xpath("((//button[normalize-space(text())=\"Women's\"])[2]/following::ul/child::li/child::a[normalize-space(text())='Player Rankings'])[1]")).click();
		driver.close();
	}
}
