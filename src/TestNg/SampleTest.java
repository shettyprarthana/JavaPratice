package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void demoTest() {
		//exceution level report
		Reporter.log("Hello world", true);
		//true- print in report and console
		//add testng libraries for first time
	}
}
