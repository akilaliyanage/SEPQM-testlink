import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class ThriftyRentSystemTest {

	ThriftyRentSystem obj = new ThriftyRentSystem();
	@Test
	public void testAdd() {
		String type = "car";
		int year = 2010;
		String make = "2010";
		String model = "suv";
		String id = "0000";
		int seats = 7;
		
		String expResult = "C_0000:2010:2010:suv:7:Available";
		String result = obj.add(type,year,make,model,id,seats);
		
		Assert.assertEquals(expResult, result);
		//fail("Not yet implemented");
				
		
	}

}
