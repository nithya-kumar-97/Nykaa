package Nykaa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickFaceCream {
	static WebDriver driver;

	public ClickFaceCream(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='skin'])[2]")
	private WebElement skin;
	@FindBy(xpath = "(//a[contains(text(),'Face Wash')])[2]")
	private WebElement faceCream;
	@FindBy(xpath = "//div[@class='css-xrzmfa']")
	private List<WebElement> clickFaceCream;
	@FindBy(xpath = "//select[@class='css-2t5nwu']")
	private WebElement selectOption;
	@FindBy(xpath = "(//button[@class=' css-12z4fj0'])[1]")
	private WebElement addToCart;
	@FindBy(xpath = "//div[@class='css-0 e1ewpqpu1']/button")
	private WebElement clickCart;
	@FindBy(xpath = "//iframe[@class='css-acpm4k']")
	private WebElement frame;
	@FindBy(xpath = "(//img[@class='css-16z7tzi ek8d9s80'])[3]")
	private WebElement clickQuantityButton;
	@FindBy(xpath = "(//div[@value='3'])[2]")
	private WebElement Clickquantity;
	@FindBy(xpath = "(//button[@class='css-guysem e8tshxd0'])[2]")
	private WebElement clickProceed;
	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginButton;
	@FindBy(xpath = "//div[@class='new-login-radius-container social']")
	private WebElement emailAndMobileNoButton;
	@FindBy(xpath = "//input[@name='identifier']")
	private WebElement email;
	@FindBy(xpath = "//button[@class='button big fill full ']")
	private WebElement submit;
	@FindBy(name = "userName")
	private WebElement userName;
	@FindBy(name = "phoneNumber")
	private WebElement mobileNo;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "//button[text()='register']")
	private WebElement register;

	@FindBy(xpath = "//div[@class='css-1pan5g8 e1gecm6x0']")
	private WebElement click;

	@FindBy(xpath = "(//input[@class='input-element  '])[1]")
	private WebElement pincode;

	@FindBy(xpath = "//div[@class='inner-wrap']/input[@placeholder='House/ Flat/ Office No.']")
	private WebElement clickHouseData;

	@FindBy(xpath = "//textarea[@class='input-element input-area ']")
	private WebElement enterStreet;

	@FindBy(xpath = "//span[@class='slider round css-0 e1rxn2v03']")
	private WebElement clickCheckBox;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement enterName;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement entermobileNumber;

	@FindBy(xpath = "//button[text()='Ship to this address']")
	private WebElement ShipToThisAddress;
	@FindBy(xpath = "//div[@class='css-30h9hi efuv1qx0']/p[text()='Credit/Debit Card']")
	private WebElement creditCard;
	@FindBy(xpath = "//input[@placeholder='Card Number']")
	private WebElement cardNumber;
	@FindBy(xpath = "//input[@placeholder='Expiry (MM/YY)']")
	private WebElement expiryDate;
	@FindBy(xpath = "//input[@placeholder='CVV']")
	private WebElement cvv;
	@FindBy(xpath = "//button[@class='css-v61n2j e8tshxd0']")
	private WebElement submitButton;

	@FindBy(xpath = "//input[@class='input text-center login-input']")
	private WebElement emailAndMobileNo;

	@FindBy(name = "emailMobile")
	private WebElement emailOrMobile;
	@FindBy(id = "submitVerification")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[text()='send otp to email']")
	private WebElement otp;

	public WebElement getEnterOtp() {
		return otp;
	}

	public WebElement getClickSubmitBtn() {
		return submitBtn;
	}

	public WebElement getEnterEmailOrMobileNo() {
		return emailOrMobile;
	}

	public WebElement getEnterEmailAndMobileNo() {
		return emailAndMobileNo;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getClickCardNumber() {
		return cardNumber;
	}

	public WebElement getClickcreditCard() {
		return creditCard;
	}

	public WebElement getClickShipToThisAddress() {
		return ShipToThisAddress;
	}

	public WebElement getEnterMobileNumber() {
		return entermobileNumber;
	}

	public WebElement getEnterName() {
		return enterName;
	}

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getEnterStreet() {
		return enterStreet;
	}

	public WebElement getClickHouseData() {
		return clickHouseData;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getEnterPincode() {
		return pincode;
	}

	public WebElement getClickRegisterButton() {
		return register;
	}

	public WebElement getMobileNumber() {
		return mobileNo;
	}

	public WebElement getEnterPassword() {
		return password;
	}

	public WebElement getEnterUserName() {
		return userName;
	}

	public WebElement getEnterSubmit() {
		return submit;
	}

	public WebElement getSkin() {
		return skin;
	}

	public WebElement getClickEmailAndMobileNoButton() {
		return emailAndMobileNoButton;
	}

	public WebElement getEnterEmail() {
		return email;
	}

	public WebElement getClickProceedButton() {
		return clickProceed;
	}

	public WebElement getClickLoginButton() {
		return loginButton;
	}

	public WebElement getClickQuantity() {
		return Clickquantity;
	}

	public WebElement getswitchToFrame() {
		return frame;
	}

	public WebElement getFaceCream() {
		return faceCream;
	}

	public WebElement getClickQuantityButton() {
		return clickQuantityButton;
	}

	public List<WebElement> getClickCream() {
		return clickFaceCream;
	}

	public WebElement getselectOption() {
		return selectOption;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getClickCart() {
		return clickCart;
	}
}
