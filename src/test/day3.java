package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com

public class day3 {
	@BeforeClass
	public void befoclas() {
		System.out.println("I am BEFORE CLASS of Day3");
	}

	@Parameters({ "URL", "APIKey/usrname" })
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println(" I am BEFORE METHOD OF CLASS day3");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println(" I am AFTER METHOD OF CLASS day3");
	}

	@AfterClass
	public void afteclas() {
		System.out.println("I am AFTER CLASS of day3");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}

	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am BEFORE SUITE of class day3");
	}

	@Test(enabled = false)
	public void MobilesignimcarLoan() {
		// Appium
		System.out.println("I am enabled false  Mobile SIGIN");
		Assert.assertEquals("Hi", "BYE");
	}

	@Test(dataProvider = "getData")
	public void MobilesignoutcarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(dependsOnMethods = { "WebloginCarLoan", "MobilesignoutcarLoan" })
	// @Test
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combiantion - username password - good credit history= row
		// 2nd - username password - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// couloumns in the row are nothing but values for that particualar
		// combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
