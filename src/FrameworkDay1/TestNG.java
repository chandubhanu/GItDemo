package FrameworkDay1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TestNG {
@BeforeClass
public void beforeclass() {
	System.out.println("Before executing any method in the class");
}

@AfterClass
public void Afterclass() {
	System.out.println("After  executing all method in the class");
}
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
@Parameters({"URL","API"})
	@Test
	public void Demosecondtest(String URL,int API) {
		System.out.println("SecondTest");
		System.out.println(URL);
		System.out.println(API);
	}
}
