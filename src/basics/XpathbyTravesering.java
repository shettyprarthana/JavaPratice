package basics;
/*by removing index it shoild work cox we have given attribute*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyTravesering {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("_2doB4z")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']/../../div[2]/div/div/div[@class='_30jeq3 _1_WHN1']")).getText();
		Thread.sleep(2000);
		System.out.println(price);
		driver.close();
}
}
