package Amazon;
/*pending*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkandPartialLinkLocator {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.linkText("Amazon Prime Music")).click();
		
	}

}
