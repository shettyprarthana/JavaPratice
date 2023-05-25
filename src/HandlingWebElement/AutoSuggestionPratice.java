package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionPratice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for (WebElement element : autosuggestion) {
			System.out.println(element.getText());
			
		}
		driver.close();
		
	}
}
