package kell;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class Test {
	
	Kell Kell = new Kell();

	@org.junit.jupiter.api.Test
	public void Test1() {
		//fail("Not yet implemented");]
		assertEquals(180 , kell.Kell.CalcAngle(6, 0));
		//assertEquals("Nurk on " , 90 , kell.Kell.CalcAngle(6, 0));
		
	}
	
	@org.junit.jupiter.api.Test
	public void Test2() {
		assertEquals(90, kell.Kell.CalcAngle(6, 0));
	}
	
	@org.junit.jupiter.api.Test
	public void Test3() {
		int expectedangle = 180;
		assertEquals(expectedangle,kell.Kell.CalcAngle(6, 0));
	}
	
}	
