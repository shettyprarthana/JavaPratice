package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountAndPriorityTest {
	@Test(priority=1, invocationCount=2)
	public void test1() {
		Reporter.log("test1", true);
	}
	@Test (priority=-1)
	public void test2() {
		Reporter.log("test2", true);
	}
	@Test(invocationCount=3)
	public void test3() {
		Reporter.log("test3", true);
	}
	@Test(priority=-2, invocationCount=0)
	public void test4() {
		Reporter.log("test4", true);
	}
}
