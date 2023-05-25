package groupExecution;

import org.testng.annotations.Test;

public class TestClass3 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("TestClass3-smoke");
	}
	@Test(groups="Regression")
	public void tc2() {
		System.out.println("TestClass3-regression");
	}
	@Test(groups={"Smoke","Regression"})
	public void tc3() {
		System.out.println("TestClass3-smoke and regression");
	}
	@Test(groups={"Smoke","Sanity","Regression"})
	public void tc4() {
		System.out.println("TestClass3-smoke, Sanity and regression");
	}
	@Test
	public void tc5() {
		System.out.println("TestClass3-regression");
	}
}
