package basics;
import org.openqa.selenium.By;
/*login script Scenario
 * open the browser
 * enter demo.actitime.com
 * enter valid username=admin and password=manager
 * click on login
 * validate the home page
 * close the browser
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {	
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	//driver.findElement(By.name("pwd")).sendKeys("manager");

	driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	//driver.findElement(By.id("loginButton")).click();
	Thread.sleep(4000);
	if(driver.getTitle().contains("ime-Track"))
		
			System.out.println("Home page displayed - Test Pass");
	else
				System.out.println("Home page not displayed - Test Fail");
	Thread.sleep(3000);
	driver.close();
			

	}

}
