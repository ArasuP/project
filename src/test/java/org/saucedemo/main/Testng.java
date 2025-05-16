package org.saucedemo.main;

import org.junit.Assert;
import org.saucedemo.baseclass.BaseClass;
import org.saucedemo.pages.CartPage;
import org.saucedemo.pages.LoginPages;
import org.saucedemo.pages.OrderConfirmationPage;
import org.saucedemo.pages.ProductPages;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng extends BaseClass {

	@Test(dataProvider = "data", priority = -15)
	private void login(String s1[]) {
		browserLaunch("CHROME");
		implicitWait();
		enterApplnUrl("https://www.saucedemo.com/");
		maximizeWindow();
//		closeWindow();

		LoginPages homePage = new LoginPages();
		homePage.homePages(s1[0], s1[1]);

	}

	@Test(dataProvider = "data", priority = -11)
	private void loginErrMessage(String s1[]) {
		browserLaunch("CHROME");
		implicitWait();
		enterApplnUrl("https://www.saucedemo.com/");
		maximizeWindow();

		LoginPages homePage1 = new LoginPages();
		homePage1.homePages1(s1[2], s1[3]);
		String loginErrMessage = homePage1.LoginErrMessage();
		System.out.println(loginErrMessage);
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
				loginErrMessage);

	}

	@Test(dataProvider = "data", priority = -10)
	private void addToCart(String s1[]) {
		browserLaunch("CHROME");
		implicitWait();
		enterApplnUrl("https://www.saucedemo.com/");
		maximizeWindow();

		LoginPages homePage2 = new LoginPages();
		homePage2.homePages(s1[0], s1[1]);

		ProductPages productPages = new ProductPages();
		productPages.AddProduct();

		String addcartNo = productPages.getAddcartNo();
		System.out.println(addcartNo);
		Assert.assertEquals("1", addcartNo);

		CartPage cartPage = new CartPage();
		cartPage.CartDetails(s1[4], s1[5], s1[6]);

		OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
		String orderConfirmationPages = orderConfirmationPage.OrderConfirmationPages();
		System.out.println(orderConfirmationPages);
		Assert.assertEquals("Thank you for your order!", orderConfirmationPages);

	}

	@DataProvider(name = "data")
	private Object[][] data() {
		return new Object[][] {
				{ "standard_user", "secret_sauce", "locked_out_use", "secret_sauce", "arasu", "palanivel", "600097" } };

	}
}
