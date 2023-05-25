package WebElement;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelectedMethod {
	public static void main(String[] args)  {

		//WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		WebElement gender= driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/descendant::input[1]"));
		gender.click();
		if(gender.isSelected())
			System.out.println("selected");
		else
			System.out.println("not selected");
		
		driver.close();
	}
}
