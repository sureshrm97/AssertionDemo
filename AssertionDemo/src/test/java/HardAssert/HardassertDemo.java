package HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardassertDemo {
	
	@Test
	public void testcases1() {
		System.out.println("******************************");
		System.out.println("Test Started");
		Assert.assertTrue(false);
		System.out.println("Test End");
		System.out.println("******************************");
	}
	
	@Test
	public void testcases2() {
		System.out.println("******************************");
		System.out.println("Test2 Started");
		Assert.assertTrue(false);
		System.out.println("Test2 End");
		System.out.println("******************************");
	}


}
