package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadPopUpSendKeys {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to click on upload resume
		driver.findElement(By.xpath("//div[normalize-space(text())='Upload Resume']")).click();
				
		//to click on file upload
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Downloads\\Prarthana_Shetty_AT.pdf");
		Thread.sleep(2000);
		driver.close();
		
		//go to particular file->  shift_right click->copy as path
	}
}

