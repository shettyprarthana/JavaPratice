package HandlingWebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement forgotPwdLink = driver.findElement(By.linkText("Forgotten password?"));
		Actions actions=new Actions(driver);
		actions.contextClick(forgotPwdLink).perform();
		Thread.sleep(3000);
		Robot r =new Robot();  //Robot class to get the Keyboard access
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);  //release the key or else keyboard will get corrupted
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
}
