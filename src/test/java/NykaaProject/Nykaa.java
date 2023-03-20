package NykaaProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");

	}

	@Test
	public static void clickSkinAndFaceCream() {
		WebElement target = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions actObject = new Actions(driver);
		actObject.moveToElement(target).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Face Wash')])[2]")).click();

	}

	@Test
	public static void clickFaceCream() throws InterruptedException {
		System.out.println("-----------------");
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String next : child) {
			if (!parent.equals(next)) {
				driver.switchTo().window(next);
				Thread.sleep(2000);
				System.out.println("-----------------");
				System.out.println(
						driver.findElement(By.xpath("//h1[text()='Face Wash Products Collection']")).getText());
				driver.findElement(By.xpath("//div[text()='Nykaa Naturals Face Wash']']")).click();
				Thread.sleep(2000);

			}
		}
	}
}
