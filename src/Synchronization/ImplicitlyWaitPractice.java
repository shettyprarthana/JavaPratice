package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWaitPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	//	String title=driver.getTitle();
		//System.out.println(title);
		//String pageTitle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		WebElement pageTitle=driver.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		//if(title.equals(pageTitle.getText()))
		//if(pageTitle.equals("Enter Time-Track"))
		if(pageTitle.getText().equals("Enter Time-Track"))
			System.out.println("home page displayed");
		else
			System.out.println("failed");
		driver.close();
	}
}
