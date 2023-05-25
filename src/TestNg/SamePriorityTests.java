package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SamePriorityTests {

	@Test
	public void googgleTest() {
		Reporter.log("google", true);
	}
	@Test
	public void ebayTest() {
		Reporter.log("ebay", true);
	}
}
