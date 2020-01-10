package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import primusbank.library.AdminHomePage;
import primusbank.library.PrimusBankHomePage;

public class AdminLoginTest extends Constants
{
	
	@Parameters({"uname","pword"})
	@Test
	public void checkAdminLogin(String uid,String pwd) 
	{		
		
		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res= phome.adminLogin(uid, pwd);
		Assert.assertTrue(res);
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();		
	}

}
