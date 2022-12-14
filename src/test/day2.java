package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "Smoke" })
	public void ploan() {
		System.out.println("I am test method of class day2 with GROUP Smoke");
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("I am BEFORE TEST of class day2");
	}

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am BEFORE SUITE of class Day2");
	}
}
