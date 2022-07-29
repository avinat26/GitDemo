package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@mobiletest")
	public void beforeMobileTest() {
		System.out.println("Before mobile test");
	}
	
	@After("@mobiletest")
	public void afterMobileTest() {
		System.out.println("After Mobile Test");
	}

}
