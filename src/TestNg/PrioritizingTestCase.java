package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritizingTestCase {


@Test
public void demoTest1() {
	Reporter.log("demoTest1", true);
}
@Test(priority = -2)
public void demoTest2() {
	Reporter.log("demoTest2", true);
}
@Test(priority = 2)
public void demoTest3() {
	Reporter.log("demoTest3", true);
}
@Test
public void demoTest4() {
	Reporter.log("demoTest4", true); 
}
@Test(priority = -1)
public void demoTest5() {
	Reporter.log("demoTest5", true);
}
}
