package javaPackage1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T4 {
	
	@Test
	public void a() {
		System.out.println("A method");
	}
	
	@Test(enabled = false)
	public void b() {
		System.out.println("B method");
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("C method");
	}

	@Test(invocationCount = 0)
	public void d() {
		System.out.println("D method");
	}
	
	@BeforeMethod
	public void e() {
		System.out.println("E method");
	}
	
	@BeforeTest
	public void f() {
		System.out.println("F method");
	}
	
	@Test
	public void g() {
		System.out.println("G method");
	}
	
	@BeforeClass
	public void h() {
		System.out.println("H method");
	}
	
	@BeforeSuite
	public void i() {
		System.out.println("I method");
	}
	
	@AfterClass
	public void j() {
		System.out.println("J method");
	}
	@AfterSuite
	public void k() {
		System.out.println("K method");
	}
	
	@AfterMethod
	public void l() {
		System.out.println("L method");
	}
	
	@Test
	public void m() {
		System.out.println("M method");
	}
	
	@AfterTest
	public void n() {
		System.out.println("N method");
	}
}
