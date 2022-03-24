package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PRacticeTestclss {
	@BeforeClass
	public void login() {
		System.out.println("besore Class ");
	}
	@BeforeMethod
	public void beforeMethof() {
		System.out.println("befor Metjod");
	}
	@Test
	public void tsstClass() {
		System.out.println("test Class");
	}
	@Test
	public void secondTest() {
		System.out.println("second Test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after CLass");
		
	}
	
}
