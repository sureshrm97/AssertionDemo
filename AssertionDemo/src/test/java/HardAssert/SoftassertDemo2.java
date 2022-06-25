package HardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftassertDemo2 {
	
	SoftAssert obj=new SoftAssert();
	SoftAssert obj1=new SoftAssert();

	@Test
	public void testcases1() {
		System.out.println("******************************");
		System.out.println("Test Started");
		obj.assertTrue(false);
		obj.assertEquals("hello", "HELLO");
		System.out.println("Test End");
		System.out.println("******************************");
		obj.assertAll();
	}
	
	@Test
	public void testcases2() {
		System.out.println("******************************");
		System.out.println("Test2 Started");
		obj1.assertTrue(false);
		
		obj1.assertEquals("hello", "HELLO");
		System.out.println("Test2 End");
		System.out.println("******************************");
		obj1.assertAll();
	}


}
