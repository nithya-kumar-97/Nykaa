package NykaaProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.Base_Class;

public class Project extends Base_Class {
	@Test
	public void method() {
		launchBrowser("chrome");
		getUrl("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3] ")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		alertMethod("Nithya");
	}
}
