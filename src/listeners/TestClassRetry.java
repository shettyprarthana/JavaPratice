package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//select class->rightClick->copy qualified Name
@Listeners(listeners.ListernersImplementation.class)
public class TestClassRetry extends BaseClass {


		@Test
		public void tc1() {
			Reporter.log("hello",true);
		}
		@Test(retryAnalyzer= listeners.RetryImplementation.class)
		public void tc2() {
			System.out.println("retry pratice");
			Assert.fail();
		}
}

