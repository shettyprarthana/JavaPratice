package groupExecution;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test(groups="Regression")
	public void tc1() {
		System.out.println("TestClass2-regression");
	}
	@Test(groups="Sanity")
	public void tc2() {
		System.out.println("TestClass2-sanity");
	}
	@Test(groups={"Regression","Sanity"})
	public void tc3() {
		System.out.println("TestClass2-regression and sanity");
	}
}
