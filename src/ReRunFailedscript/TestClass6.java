package ReRunFailedscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass6 {
	
	@Test
	public void test1() {
		System.out.println("TestClass6-test1");
	}
	
	@Test
	public void test2() {
		System.out.println("TestClass6-test2");
		//Assert.fail();
	}
}
