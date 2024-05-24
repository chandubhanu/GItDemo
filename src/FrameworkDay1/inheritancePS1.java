package FrameworkDay1;


import org.testng.annotations.Test;

public class inheritancePS1 extends ps{

	
	
	@Test
public void testrun()
{
		int a=3;
		getdata();
		ps2 a1=new ps2(3);
		System.out.println(a1.increment());	
		System.out.println(a1.decrement());	
		System.out.println(a1.mul2());	
		System.out.println(a1.mul3());		
}	

} 