package basics;
/*partally changing element*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathContains4 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(), 'accounts used')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'build ')]")).click();
		
		driver.close();
}
}
