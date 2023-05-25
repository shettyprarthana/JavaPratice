package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetWindowSize {
	public static void main(String[] args) throws InterruptedException {
		
		//to launch firefox brower
		WebDriver driver = new FirefoxDriver();
		//always set the window size to maximum
		driver.manage().window().maximize();
		
		//navigate to web application
		driver.get("https://www.google.com/");
		 //  driver.get("https://www.amazon.in/");
		 //  driver.get("https://www.myntra.com/");
		//to set the window size
      
		
		//Dimension d = new Dimension(1024, 768);
		//Dimension d = new Dimension(1920, 1080);
		//Dimension d = new Dimension(1366, 768);
		//Dimension d = new Dimension(1536, 864);

		Dimension d = new Dimension(1024, 768);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();
		
	}

}
