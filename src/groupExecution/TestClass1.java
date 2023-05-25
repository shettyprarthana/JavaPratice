package groupExecution;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test(groups="Smoke")
	public void tc1() {
		System.out.println("TestClass1-smoke");
	}
	@Test(groups="Sanity")
	public void tc2() {
		System.out.println("TestClass1-sanity");
	}
	@Test(groups={"Smoke","Sanity"})
	public void tc3() {
		System.out.println("TestClass1-smoke and sanity");
	}
}
