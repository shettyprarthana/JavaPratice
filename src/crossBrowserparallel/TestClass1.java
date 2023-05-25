package crossBrowserparallel;

import org.testng.annotations.Test;

public class TestClass1 extends BaseClass{

	@Test
	public void tc1() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
}
