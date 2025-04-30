package org.agrichains.com;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Testng extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("CHROME");
		implicitWait();
		enterApplnUrl("https://agrichain.com");
		maximizeWindow();

	}
	@AfterClass
	private void afterClass() {
		closeWindow();

	}
	
	@Test(priority =-15 )
	private void test() {
		HomePage homePage=new HomePage();
		homePage.HomePages("abcabcbb");

	}
	
	@Test(priority =-13 )
	private void test1() {
		ResultPages resultPages=new ResultPages();
               String result = resultPages.result();
               Assert.assertEquals(result ,"3", "Longest substring length is incorrect");
	}

}
