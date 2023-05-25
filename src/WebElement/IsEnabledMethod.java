package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchTF= driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		WebElement searchButton = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		if(searchTF.isEnabled() && searchButton.isEnabled())
		{
			searchTF.sendKeys("kids dress");
			searchButton.click();
		}
		driver.close();
	}
}
