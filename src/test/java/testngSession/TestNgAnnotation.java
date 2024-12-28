package testngSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
   
	// all the before annotation run first than @Test then @After
	
	
	//1 run this in @Before suit
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS ---------connect with DB");
		
	}
	
	//2 run this in @BeforeTest
	@BeforeTest
	public void createUser() {
		System.out.println("BT---------- create the user");
	}
	
	//3 run this in @BeforeClass
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC----launc the browser");
	}
	
	//4,7,10
	
	@BeforeMethod
	public void loginApp() {
		System.out.println("BM----login the app");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	
	//5
	@Test
	public void addToCartTest() {
	    System.out.println("add to cart test");
	}
	//8
	@Test
	public void checkOutTheTest(){
		System.out.println("check out the test");
		
	}
	//6,9,12
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("delete user");
	}
	
	
	//15
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("disconnect with DB");
	}
	
	
	
	
}
