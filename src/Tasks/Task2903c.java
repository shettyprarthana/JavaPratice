package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2903c {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@class=\"desktop-main\" and text()=\"Kids\"]")).click();
		if(driver.getTitle().contains("Kids Clothing - Buy Kids Clothes"))
			System.out.println("test pass");
		else
			System.out.println("test fail");
		Thread.sleep(3000);
		driver.close();
	}

	
}
