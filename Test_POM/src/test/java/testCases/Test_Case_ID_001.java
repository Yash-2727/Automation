package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjects_001.Gtpl_HomePage;
import pageObjects_001.LoginPage_001;
import testData_001.BaseClass_001;

public class Test_Case_ID_001 extends BaseClass_001{
	
	@Test(priority=0)
	public void LoginPage() {
		LoginPage_001 Log1= new LoginPage_001(driver);
		Log1.Login();
		
		
		
	}
	
	@Test(priority=1)
	
	public void NewCustom1() {
		Gtpl_HomePage G1 = new Gtpl_HomePage(driver);
		G1.Home_Objects();
	}
	
	
	@BeforeSuite
	public void Launch() {
		Setup1();
	}
	
	@AfterMethod
	public void screenshot() throws Exception {
		Screenshot();
	}
}
