package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	WebDriver driver;

	@BeforeSuite
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("After Test");
		driver.get("https://www.amazon.in/");

	}

	@Test
	public void getText() {
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Get the  Text->" + driver.findElement(By.xpath("//a[text()='Sell']")).getText());

	}

	@Test
	public void getText2() {
		System.out.println("Get the  Text->" + driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).getText());

	}

	@AfterTest
	public void afterMethod() {
		System.out.println("After Test");
		driver.close();
	}

}
