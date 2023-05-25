package ReRunFailedscript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	public void test1() {
		System.out.println("TestClass3-test1");
		//Assert.fail();
	}
	
	@Test
	public void test2() {
		System.out.println("TestClass3-test2");
	}

}
