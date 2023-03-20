package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	@BeforeSuite
	public void method8() {
		System.out.println("Before Suite");
	}

	@Test
	public void method1() {
		System.out.println("Test1");
	}

	@Test
	public void testmethod() {
		System.out.println("Test2");
	}

	@Test
	public void testmethod1() {
		System.out.println("Test3");
	}

	@BeforeTest
	public void method2() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void method3() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void method4() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void method5() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void method6() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void method7() {
		System.out.println("After Class");
	}

	@AfterSuite
	public void method9() {
		System.out.println("After Suite");
	}
}
