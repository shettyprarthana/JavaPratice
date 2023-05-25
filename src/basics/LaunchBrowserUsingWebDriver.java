package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserUsingWebDriver {
	public static void main(String[] args) {
		//chrome
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//WebDriver driver1 = new ChromeDriver(options);
		
		//firefox
	//	WebDriver driver2 = new FirefoxDriver();
		
		//edge
		WebDriver driver3 = new EdgeDriver();
	}

}
