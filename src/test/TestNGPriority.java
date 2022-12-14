package test;

import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority =  2)
	public void test1() {
		System.out.println("Starting execution of TEST1");
	}

	@Test(priority =  3)
	public void test2() {
		System.out.println("Starting execution of TEST2");
	}

	@Test(priority =  -1)
	public void test3() {
		System.out.println("Starting execution of TEST3");
	}
	
	@Test
	public void testNopriority() {
		System.out.println("This test case has no priority");
	}
	@Test(priority = 0)
	public void testZeropriority() {
		System.out.println("This test case has zero priority");
	}
	
}
