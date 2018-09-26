package TestNG_sel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumTesting {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
		System.out.println("running before method");

  }

  @AfterMethod
  public void afterMethod() {
		System.out.println("running after method");
 }

  @BeforeClass
  public void beforeClass() {
		System.out.println("running before class");
  }

  @AfterClass
  public void afterClass() {
		System.out.println("running after class ");
 }

  @BeforeTest
  public void beforeTest() {
		System.out.println("running before test");
  }

  @AfterTest
  public void afterTest() {
		System.out.println("running after test ");
 }

  @BeforeSuite
  public void beforeSuite() {
		System.out.println("running before suite");
  }
/*
  @Test
	SeventhSeleniumTest.runTestA_LookInAutomationPracticeSite();
	runTestA_LookInAutomationPracticeSite();
  
  @Test
  	runTestB_ShowDataInSecondPage();
	
  @Test
  	runTestC_PlayWithXpathsInLegal();
*/

	public static void main(String[] args) {
		System.out.println("this is the only line running, and it is running from selenium testing.");
	}

}
