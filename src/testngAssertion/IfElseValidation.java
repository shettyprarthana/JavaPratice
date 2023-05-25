package testngAssertion;

import org.testng.annotations.Test;

public class IfElseValidation {
	@Test
	public void demo() {
		String s1="hello";
		String s2="Hello";
		
		if(s1.equals(s2))
		System.out.println(s1);
		else
		System.out.println(s2);
}
}
