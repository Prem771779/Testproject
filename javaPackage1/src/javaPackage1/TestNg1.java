package javaPackage1;

import org.testng.annotations.*;

public class TestNg1 {
	
	@Test
	public void a() {
		System.out.println("Hello TestNG");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("hello B");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("Hello C");
		
	}
	
	@AfterMethod
	public void d( ) {
		System.out.println("Hello D");
	}
	
	@AfterClass
	public void e1() {
		System.out.println("Hello E1");
	}
	
	@AfterTest
	public void f() {
		System.out.println("hello f");
	}
	
	@AfterSuite
	public void e() {
		System.out.println("hello e");
	}
	

}