package basics;
/*xpath contains() can handle spaces- non breakable space */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathContains3 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Take product tour')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Products')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Solutions')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Resources')]")).click();
		Thread.sleep(2000);
		driver.close();
		
}
}
