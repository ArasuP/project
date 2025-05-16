package org.saucedemo.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	
	public static void browserLaunch(String browserType) {

		switch (browserType) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsDisplayed(element) && elementIsEnabled(element)) {

			element.sendKeys(data);
		}
	}

	public static void elementClick(WebElement element) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

	public String elementGetText(WebElement element) {
		visibilityOfElement(element);
		String text = null;

		if (elementIsDisplayed(element)) {
			text = element.getText();
		}
		return text;
	}

	public static void closeWindow() {
		driver.close();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void visibilityOfElement(WebElement element) {
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean elementIsDisplayed(WebElement element) {

		visibilityOfElement(element);
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean elementIsEnabled(WebElement element) {
		visibilityOfElement(element);
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean elementIsSelected(WebElement element) {
		visibilityOfElement(element);
		boolean selected = element.isSelected();
		return selected;
	}

}
