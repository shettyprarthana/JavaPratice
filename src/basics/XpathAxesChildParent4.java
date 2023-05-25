package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*//a[text()='Bholaa ']/parent::strong/parent::td/parent::tr/child::td[text()='44.28 Crore'] can't take text coz it is dynamic
 * //a[text()='Bholaa ']/parent::strong/parent::td/parent::tr/child::td[2] 
 * https://www.bollymoviereviewz.com
 / go to bollywood box office
  * try dasara movie
 */
public class XpathAxesChildParent4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li/a[text()='Bollywood Box Office'])[1]")).click();
		Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//a[text()='Bholaa ']/parent::strong/parent::td/parent::tr/child::td[2]")).getText();
		Thread.sleep(1000);
		System.out.println(text);
		String text2=driver.findElement(By.xpath("//a[contains(text(),'Dasara (Telugu)')]/parent::strong/parent::td/parent::tr/child::td[2]")).getText();
		Thread.sleep(1000);
		System.out.println(text2);
		driver.close();
	}
}
