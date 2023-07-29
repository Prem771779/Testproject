package javaPackage1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T5 {

	@Test
	public void a() {
		Assert.assertTrue(3 > 12);
		System.out.println("AS method");
	}
	
	@Test(dependsOnMethods = "a")
	public void m() {
		System.out.println("M method");
	}

}