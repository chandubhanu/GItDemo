package FrameworkDay1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterSuite
	public void afsuite() {
		System.out.println("I am no 1 from Last");
	}
@Test
//@Test(groups= {"Smoke"})
public void weblogincarloan() {
	//Selenium code
	System.out.println("weblogincarloan");
}
@BeforeSuite
public void bfsuite() {
	System.out.println("I am no 1");
}
@Test(groups= {"Smoke"})
public void MobileLogincarLoan() {
	//Appium
	System.out.println("MobileLogincarLoan");
}
@Test
//@Test(dependsOnMethods={"weblogincarloan","bfsuite"})
public void LoginAPIcarLoan()
{
//Rest API automation	
	System.out.println("LoginAPIcarLoan");
}
@AfterTest
public void Logout() {
	System.out.println("LOgOut");
}
}
