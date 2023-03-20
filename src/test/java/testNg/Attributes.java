package testNg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes {
	WebDriver driver;

	@Parameters("name")
	@Test(groups = "Smoke", priority = 5, enabled = true, timeOut = 2000)
	public void method1(String stringName) {
		System.out.println("Method1" + stringName);
	}

	@Test(groups = "Regression", invocationCount = 3, invocationTimeOut = 1000)
	public void method2() {
		System.out.println("Method2");
	}

	@Parameters("name1")
	@Test(groups = "Regression", priority = 7)
	public void method3(String stringName) {
		System.out.println("Method3" + stringName);
	}

	@Test(groups = "Smoke", priority = 4, alwaysRun = true)
	public void method4() {
		System.out.println("Method4");
	}

	@Test(groups = "Regression", priority = 2, dependsOnMethods = "method4")
	public void method5() {
		System.out.println("Method5");
	}

	@Test(groups = "Regression and Smoke", priority = 1, description = "It's a Very important method,We should give high priority to this method")
	public void method6() {
		System.out.println("Method6");
	}

	@Test(groups = "Smoke", expectedExceptions = IOException.class, enabled = false)
	public void method7() {
		System.out.println("Method7");
	}

	@Test(groups = "Regression", invocationCount = 6, threadPoolSize = 3, enabled = false)
	public void method8() {
		System.out.println("Method8");

		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.nykaa.com/");

	}
}
