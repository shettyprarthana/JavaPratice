package basics;
/*incomplete*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathKeywords {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.className("L0Z3Pu")).click();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T' or contains(text(), 'iPhone')]")).click();
		driver.close();
}
}
