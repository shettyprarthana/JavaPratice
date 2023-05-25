package basics;
/* handles lengthy text*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicRelativeXpathContains2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String headerText= driver.findElement(By.xpath("//h2[contains(text(), 'Facebook')]")).getText();
		String aboutText= driver.findElement(By.xpath("//a[contains(@title, 'blog')]")).getText();
        Thread.sleep(2000);
        System.out.println(headerText+"\n"+aboutText);
        driver.close(); 
}
}
