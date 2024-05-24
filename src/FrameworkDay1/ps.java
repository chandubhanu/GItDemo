package FrameworkDay1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ps {
	
	@BeforeMethod
	public void beforerun() {
		System.out.println("First run");
	}
	
	@AfterMethod
	
	public void Afterrun() {
		System.out.println("lasts run");
	}
	public void getdata() {
		
	

	
System.out.println("i am parent");
	

}
}