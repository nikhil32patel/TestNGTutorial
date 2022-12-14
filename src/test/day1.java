package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution() {
		System.out.println("I am AFTER TEST of class day1");
	}

	@Test
	public void Demo() {
		System.out.println("I am Demo test method of class day1");// automation

		Assert.assertTrue(false);
		// Assert.assertTrue(false);
	}

	@AfterSuite
	public void afSyite() {
		System.out.println("I am AFTER SUITE of class day1 ");

	}

	@Test
	public void SecondTest() {
		System.out.println("I am SecondTest method of class day1");
	}

}
