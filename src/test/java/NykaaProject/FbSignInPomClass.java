package NykaaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignInPomClass {
	static WebDriver driver;

	public FbSignInPomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement userName;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;

	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement clickLoginButton() {
		return login;
	}

}
