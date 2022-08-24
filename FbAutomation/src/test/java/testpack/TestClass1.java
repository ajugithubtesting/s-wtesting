package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
@BeforeTest
public void beforetest() {
	System.out.println("BeforeTest TestClass1");
}
@BeforeClass
public void beforeClass() {
	System.out.println("BeforeClass TestClass1");
}
@BeforeMethod
public void beforeMethod() {
System.out.println("beforeMethod TestClass1 ");
}
@Test
public void testB() {
System.out.println(" testC TestClass1 ");
}
@Test
public void testA() {
System.out.println("testD TestClass1 ");
}
@Test
public void testF() {
System.out.println("testF TestClass1 ");
}
@AfterClass
public void AfterClass() {
System.out.println("AfterClass TestClass1 ");
}
@AfterMethod
public void afterMethod() {
System.out.println("afterMethod TestClass1");
}
@AfterTest
public void aftertest() {
	System.out.println("AfterTest TestClass1");
}
}
