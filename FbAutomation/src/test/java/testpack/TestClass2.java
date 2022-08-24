package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest TestClass2");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass TestClass2");
	}
		@BeforeMethod
		public void beforeMethod() {
		System.out.println("beforeMethod TestClass2 ");
	}
		@Test
		public void testC() {
		System.out.println(" testC TestClass2 ");
		}
		@Test
		public void testD() {
		System.out.println("testD TestClass2 ");
		}
		@Test
		public void testM() {
		System.out.println("testM TestClass2 ");
		}
		@AfterClass
		public void AfterClass() {
		System.out.println("AfterClass TestClass2 ");
		}
		@AfterMethod
		public void afterMethod() {
		System.out.println("afterMethod TestClass2 ");
       }
		@AfterTest
		public void aftertest() {
			System.out.println("AfterTest TestClass2");
		}
		
}