package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

public class LaunchUserDefinedBrowser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the choice");
		System.out.println("1. To open empty Chrome Browser \n"+
				"2. To open empty Firefox Browser \n"+
				"3. To open empty Edge Browser \n");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1://launching empty chrome browser
		ChromeDriver driver1= new ChromeDriver();
		break;
		
		case 2: //launching empty firefox browser
		FirefoxDriver driver2= new FirefoxDriver();
		break;
		
		case 3: //launching empty edge browser
		 EdgeDriver driver3= new EdgeDriver();
		}
	}

}
