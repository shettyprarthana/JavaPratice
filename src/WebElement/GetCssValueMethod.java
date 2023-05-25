package WebElement;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCssValueMethod {
	public static void main(String[] args) throws IOException {

		//WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginButton=driver.findElement(By.name("login"));
		System.out.println(loginButton.getCssValue("font"));
		System.out.println(loginButton.getCssValue("color"));
		System.out.println(loginButton.getCssValue("background-color"));
		driver.close();
		
	}
}
