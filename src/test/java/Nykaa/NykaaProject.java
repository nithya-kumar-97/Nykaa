package Nykaa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class NykaaProject extends Base_Class {
	@BeforeTest
	public static void setup() {
		launchBrowser("chrome");
		getUrl("https://www.nykaa.com/");
	}

	@Test
	public static void clickSkinAndFaceCream() throws InterruptedException, Exception {

		PersonalData data = new PersonalData();
		ClickFaceCream object = new ClickFaceCream(driver);
		actionsMthod(driver, "Move", object.getSkin());
		click(object.getFaceCream());
		windowHandling();
		findElementsMethod(object.getClickCream(), data.givenData);
		windowHandling();
		dropDown("visibleText", object.getselectOption(), data.flavour);
		click(object.getAddToCart());
		click(object.getClickCart());
		frames("webelement", object.getswitchToFrame());
		click(object.getClickQuantityButton());
		click(object.getClickQuantity());
		click(object.getClickProceedButton());
		implicitWait(20);

		click(object.getClickLoginButton());
		click(object.getEnterEmailAndMobileNo());
		sendKeys(object.getEnterEmailOrMobileNo(), data.emailId);
		click(object.getClickSubmitBtn());
		Thread.sleep(2000);
		click(object.getEnterOtp());
		Thread.sleep(5000);
		implicitWait(20);
		click(object.getClick());

		sendKeys(object.getEnterPincode(), data.pincode);
		click(object.getClickHouseData());
		Thread.sleep(1000);
		implicitWait(20);
		sendKeys(object.getClickHouseData(), data.flat);
		sendKeys(object.getEnterStreet(), data.street);
		click(object.getClickCheckBox());
		sendKeys(object.getEnterName(), data.username);
		implicitWait(20);
		sendKeys(object.getEnterMobileNumber(), data.mobileNumber);
		implicitWait(20);
		click(object.getClickShipToThisAddress());
		// click(object.getClickcreditCard());
		implicitWait(20);
		click(object.getClickCardNumber());
		sendKeys(object.getClickCardNumber(), data.cardNumber);
		click(object.getExpiryDate());
		sendKeys(object.getExpiryDate(), data.expiryDate);
		click(object.getCvv());
		sendKeys(object.getCvv(), data.cvv);
		click(object.getSubmitButton());
		takesSreenShot("screenshot");

	}

	@AfterTest
	public void closeWindow() {
		// quit();
	}
}