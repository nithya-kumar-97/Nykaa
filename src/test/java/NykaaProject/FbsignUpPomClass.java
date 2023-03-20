package NykaaProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsignUpPomClass {
	static WebDriver classDriver;

	public FbsignUpPomClass(WebDriver localDriver) {
		this.classDriver = localDriver;
		PageFactory.initElements(localDriver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	@FindBy(name = "firstname")
	private WebElement firstName;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement mobileNumber;
	@FindBy(id = "password_step_input")
	private WebElement password;
	@FindBy(id = "day")
	private WebElement day;
	@FindBy(id = "month")
	private WebElement month;
	@FindBy(id = "year")
	private WebElement year;
	@FindBy(name = "sex")
	private WebElement sex;
	@FindBy(name = "websubmit")
	private WebElement websubmit;

	public WebElement createCreateNewAccountButton() {
		return createNewAccount;
	}

	public WebElement enterFirstName() {
		return firstName;
	}

	public WebElement enterlastName() {
		return lastname;
	}

	public WebElement enterMobileNumber() {
		return mobileNumber;
	}

	public WebElement enterpassword() {
		return password;
	}

	public WebElement selectDay() {
		return day;
	}

	public WebElement selectMonth() {
		return month;
	}

	public WebElement selectYear() {
		return year;
	}

	public WebElement selectGender() {
		return sex;
	}

	public WebElement clickSubmit() {
		return websubmit;
	}
}
