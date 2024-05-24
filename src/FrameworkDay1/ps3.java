package FrameworkDay1;

import org.testng.annotations.Test;

public class ps3 {
	int a;	
	public ps3(int a) {
		this.a=a;
		// TODO Auto-generated constructor stub
	}
	@Test
	public int mul2() {
		a=a*2;
		return a;
	}
	@Test
	public int mul3() {
		a=a*3;
		return a;


}
}
