package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown1 {
public static void main(String[] args) throws InterruptedException {
	//WebDriver driver = new FirefoxDriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select s=new Select(dropdown);
	//to select all elements
	List<WebElement> ddList = s.getOptions();
	for (WebElement e : ddList) {
		System.out.println(e.getText());
	}
	//to check multiselect dropdown or not
	if(s.isMultiple())
		System.out.println("Multiselect dropdown");
	else
		System.out.println("single select dropdown");
	
	s.selectByIndex(5);
	Thread.sleep(3000);
	s.selectByValue("search-alias=digital-music");
	Thread.sleep(3000);
	s.selectByVisibleText("Kindle Store");
	
	driver.close();
}
}
