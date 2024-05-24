package FrameworkDay1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test(enabled=false)
	public void Ploan() {
		System.out.println("Ploan");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will Execute First");
	}
}
