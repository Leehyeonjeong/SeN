package seNex;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaclculatorTest {

	@Test
	public void testadd() {
		Calculator cal=new Calculator();
		cal.add(10,20);
		assertEquals(30,cal.getResult());
		
	}

}
