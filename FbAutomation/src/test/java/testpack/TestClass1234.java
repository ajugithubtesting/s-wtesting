package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1234 {
	
	@BeforeClass
	public void beforeClass() {
	
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("before Method");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After class");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
	
	}
	
	
	
	
	
}
