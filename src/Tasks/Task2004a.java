package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2004a {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a#gavtab-11")).click();
		driver.switchTo().frame("crossword");
		driver.findElement(By.xpath("//div[@class='tp_drp-ttl drp-lnk']/span[contains(text(),'Reveal']")).click();
		driver.findElement(By.cssSelector("a#revealWord")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@alt='IPL 2023']")).click();
		if(driver.getTitle().contains("IPL 2023 Live Cricket Scores, News,"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.close();
		
	}
}
