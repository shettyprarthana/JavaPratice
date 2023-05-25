package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteCongig() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void testCongig() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void classCongig() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void methodCongig() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void methodTearDown() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void classTearDown() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void TestTearDown() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("AfterSuite ");
	}
	
}
