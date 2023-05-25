package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameLocatorPratice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}
		Thread.sleep(3000);
		driver.close();

	}

}
