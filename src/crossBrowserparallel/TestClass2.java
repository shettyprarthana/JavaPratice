package crossBrowserparallel;

import org.testng.annotations.Test;

public class TestClass2 extends BaseClass{
	@Test
	public void tc1() throws InterruptedException {
		driver.get("https://www.swiggy.com/");
		Thread.sleep(3000);
	}
}
