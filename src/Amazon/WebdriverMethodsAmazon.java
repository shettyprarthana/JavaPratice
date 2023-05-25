package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverMethodsAmazon {
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//get()
		driver.get("https://www.amazon.in/");
		
		//getTitle()
		String title= driver.getTitle();
		System.out.println("title is: "+title);
		
		//getCurrentUrl()
		String url= driver.getCurrentUrl();
		System.out.println("url is: "+url);
		
		//getPageSource()
		//System.out.println(driver.getPageSource());
		
		//close
		driver.close();
		
		
		
	}
}
