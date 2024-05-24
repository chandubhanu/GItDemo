package FrameworkDay1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day4 {
	@Parameters({"URL"})
	@Test
	public void LoginAPIHomeLoan(String URL) {
	    // Rest API automation
	    System.out.println("LoginAPIHomeLoan");
	    System.out.println(URL);
	}

	@Test
public void webloginHomeloan() {
	//Selenium code
	System.out.println("webloginHomeloan");
}
@BeforeMethod
public void checkcookies() {
	System.out.println("Cookies deleted");
}

@AfterMethod
public void cookies() {
	System.out.println("Cookies added");
}

@Test(dataProvider="getdata")
public void MobileLoginHomeLoan(String username,String password) {
	//Appium
	System.out.println("MobileLoginHomeLoan");
	System.out.println(username);
	System.out.println(password);
}


@Test(timeOut=4000)
public void Mobilelogin() {
	System.out.println("Mobilelogin");	
}
@DataProvider
public Object[][] getdata() {
	Object[][] data=new Object[3][2];
	data[0][0]= "Firstusername";
	data[0][1]="123";
	data[1][0]= "secondusername";
	data[1][1]="1234";
	data[2][0]= "thirdusername";
	data[2][1]="1235";
return data;
}
}
