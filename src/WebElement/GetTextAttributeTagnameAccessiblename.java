package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextAttributeTagnameAccessiblename {
	public static void main(String[] args) {

		//WebDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele=driver.findElement(By.linkText("Create new account"));
		System.out.println(ele.getText());
		System.out.println(ele.getTagName());
		System.out.println(ele.getAccessibleName());
		System.out.println(ele.getAttribute("role"));
		driver.close();
	}
}
