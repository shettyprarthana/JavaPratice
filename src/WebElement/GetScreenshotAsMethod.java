package WebElement;
//IMPORTANT

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetScreenshotAsMethod {
	public static void main(String[] args) throws IOException {

		//WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		//FETCH THE SCREENSHOT AND STORE IT IN RAM
		File src= logo.getScreenshotAs((OutputType.FILE)); 
		//create a file in permanent memory
		File dest=new File("./ElementScreenshot/fblogo1.png"); 
		//FileUtils is from org.apache.commons.io package, and throws IOException
		FileUtils.copyFile(src, dest); //copy the file from RAM to permanent memory file
		
		driver.close();
	}
}
