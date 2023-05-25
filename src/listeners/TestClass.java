package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//to connect the listener to test class, provide qualified name of class to the @Listeners
//select class->rightClick->copy qualified Name
@Listeners(listeners.ListernersImplementation.class)

public class TestClass extends BaseClass {

	@Test
	public void tc1() {
		Reporter.log("hello",true);
	}
}
