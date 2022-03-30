package udemyteng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firsttest {

	@Test(invocationCount = 3)
	public void kilo() {
		System.out.println("ksk");
	}

	@BeforeTest
	public void kolo() {
		System.out.println("ksk1");
	}
	@Test
	public void jingalala() {
		System.out.println("hey thier");
	}
	
	@Test(enabled=false)
	public void kolosj() {
		System.out.println("ksk1hes");
	}

	@Test(dataProvider = "milos")
	public void zilos(String eee, int ddd) {
		System.out.println(eee);

		System.out.println(ddd);
	}

	@DataProvider
	public Object[][] milos() {
		Object[][] obj = new Object[3][2];
		System.out.println("ksk23");
		obj[0][0] = "vhsg";
		obj[0][1] = 19;

		obj[1][0] = "jdbb";
		obj[1][1] = 198;

		obj[2][0] = "bhhb";
		obj[2][1] = 19;
		return obj;

	}

}
