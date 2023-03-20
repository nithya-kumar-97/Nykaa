package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@BeforeTest
	public void setup() {
		System.out.println("Before Setup");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(dataProvider = "data")
	public void test2(String usrname, String password, int age) {
		System.out.println("Test 1");
		System.out.println("\nUsername->" + usrname + "\nPasssword->" + password + "\nAge->" + age);
	}

	@DataProvider(name = "data")
	@Test
	public Object[][] getDataFromRowCol() {
		Object[][] data = new Object[2][3];
		data[0][0] = "Nithya";
		data[0][1] = "qwerr@345";
		data[0][2] = 25;
		data[1][0] = "saro";
		data[1][1] = "poiuyt@987";
		data[1][2] = 30;
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.println(data[row][col]);
			}
		}
		return data;
	}
}
