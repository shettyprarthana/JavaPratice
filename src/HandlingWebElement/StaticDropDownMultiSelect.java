package HandlingWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownMultiSelect {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	
	WebElement dropdown = driver.findElement(By.id("cars"));
	Select s=new Select(dropdown);
	
	if(s.isMultiple()) {
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement fs=s.getFirstSelectedOption();
		System.out.println("first selected option"+fs.getText());
		
		List<WebElement> ls = s.getAllSelectedOptions();
		System.out.println("all selected options");
		for (WebElement opt : ls) {
			System.out.println(opt.getText());
		}
		
		s.deselectAll();
	}
	else
		System.out.println("single select");
	
	driver.close();
	
}
}
