package seleniumex;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGorder {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
		Reporter.log("Welcome to testNG suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void test()
	{
		System.out.println("Testing");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	


}
