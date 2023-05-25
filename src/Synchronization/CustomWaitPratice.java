package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomWaitPratice {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[text()='Start']")).click();
		int count=0;
		while(count<20)
		{
			try {
				WebElement header=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				System.out.println(header.getText());
				break;
			}
			catch(Exception e){
				count++;
			}
		}
		driver.close();
	}
}
