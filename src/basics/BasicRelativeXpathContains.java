package basics;
/* xpath contains()*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathContains {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[contains(@title, 'Voting')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Voting')]")).click();
		Thread.sleep(2000);

		if (driver.getTitle().contains("Voting"))

			System.out.println("test pass");
		else

			System.out.println("test fail");
		

		driver.close();

	}
}
