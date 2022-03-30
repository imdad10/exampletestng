package udemyteng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Secondtest {

	@Test
	public void data() {
		System.out.println("this is second test 1");
	}
	@AfterTest
	public void zip() {
		System.out.println("this is second after  test ");
	}
	
	
	
	
	
	
}
