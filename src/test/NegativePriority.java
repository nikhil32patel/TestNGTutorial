package test;

import org.testng.annotations.Test;

public class NegativePriority {
	@Test
	public void loginTest() {
		System.out.println("Testcase with default priority");
	}

	@Test(priority = -1)
	public void logoutTest() {
		System.out.println("Testcase with negative priority");

	}
}
