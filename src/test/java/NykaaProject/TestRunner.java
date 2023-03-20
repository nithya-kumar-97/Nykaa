package NykaaProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class TestRunner extends Base_Class {
	// public static WebDriver driver = Base_Class.driver;

	@BeforeTest
	public void setup() {
		launchBrowser("chrome");
		getUrl("https://www.facebook.com/");
		getTitle();
	}

	@Test(priority = 1)
	public void fbSignIn() {
		FbSignInPomClass signin = new FbSignInPomClass(driver);
		System.out.println("----");

		sendKeys(signin.getUserName(), "nithya01031997@gmail.com");
		sendKeys(signin.getpassword(), "12345");

		// click(signin.clickLoginButton());
		// implicitWait(20);
		// navigateBack();
	}

	@Test(priority = 2)
	public void fbSignUp() throws InterruptedException {

		FbsignUpPomClass signup = new FbsignUpPomClass(driver);
		click(signup.createCreateNewAccountButton());
		Thread.sleep(2000);
		sendKeys(signup.enterFirstName(), "Nithya");
		sendKeys(signup.enterlastName(), "K");
		sendKeys(signup.enterMobileNumber(), "9876543210");
		sendKeys(signup.enterpassword(), "qsdfgy6432");
		dropDown("index", signup.selectDay(), "1");
		dropDown("visibleText", signup.selectMonth(), "Mar");
		dropDown("value", signup.selectYear(), "1997");
		click(signup.selectGender());
		click(signup.clickSubmit());

	}

}
