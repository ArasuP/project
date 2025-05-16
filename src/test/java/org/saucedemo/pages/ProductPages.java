package org.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.saucedemo.baseclass.BaseClass;

public class ProductPages extends BaseClass {

	public ProductPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement clkAddToCart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement btnAddToCart;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement textAddToCart;

	public WebElement getClkAddTocart() {
		return clkAddToCart;
	}

	public void AddProduct() {
		elementClick(clkAddToCart);
		elementClick(btnAddToCart);
	}

	public String getAddcartNo() {
		String elementGetText = elementGetText(textAddToCart);
		return elementGetText;

	}
}
