package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import primusbank.library.BankerHomePage;
import primusbank.library.PrimusBankHomePage;

public class BankerLoginTest extends Constants
{

	@Parameters({"brname","uname","pword"})
	@Test
	public void checkBankerLogin(String branchname,String uid,String pwd)
	{
		PrimusBankHomePage phome=new PrimusBankHomePage();
		boolean res= phome.bankerLogin(branchname, uid, pwd);
		Assert.assertTrue(res);
		BankerHomePage bhome=new BankerHomePage();
		bhome.bankerLogout();
	}
	
	
	
}
