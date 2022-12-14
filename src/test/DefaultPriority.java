package test;

import org.testng.annotations.Test;

public class DefaultPriority {

	@Test
	public void cloginTest() {
		System.out.println("Login successful");
	}
	@Test
	public void bregisterTest() {
		System.out.println("Register successful");
	}
	@Test
	public void alogoutTest() {
		System.out.println("Logout successful");
	}
}
