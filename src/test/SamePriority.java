package test;

import org.testng.annotations.Test;

public class SamePriority {

	@Test(priority = 1)
	public void loginTest() {
	System.out.println("Login successful");

	}
	@Test(priority = 2)
	public void registerTest() {
	System.out.println("Register successful");
	}

	@Test(priority = 2)
	public void AsendEmail() {
	System.out.println("Sent email successfully");
	}

	@Test(priority = 3)
	public void logoutTest() {
	System.out.println("Logout successful");
	}
}
