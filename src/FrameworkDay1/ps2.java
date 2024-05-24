package FrameworkDay1;

import org.testng.annotations.Test;

public class ps2 extends ps3 {
	int a;
	public ps2(int a ) {
		// TODO Auto-generated constructor stub
	super(a);
		this.a=a;
	}
	@Test
	public int increment() {
		a=a+1;
		return a;
	}
	@Test
	public int decrement() {
		a=a-1;
		return a;
	}
}

