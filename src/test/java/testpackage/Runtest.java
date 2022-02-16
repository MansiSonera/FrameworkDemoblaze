package testpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.BaseClassDemo;
import pompacks.AddtoCart;
import pompacks.pompacklogin;

public class Runtest extends BaseClassDemo {
 
	pompacklogin test;
	AddtoCart cart;
	public Runtest()
	{
		super();
	}
	@BeforeTest
	public void setup()
	{
		initiatebrowser();
		test=new pompacklogin();
		cart=new AddtoCart();
	}
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		test.log();
	}
	@Test(priority=2)
	public void username() throws InterruptedException
	{
		test.typeusername(newprop.getProperty("username"));
	}
	@Test(priority=3)
	public void password() throws InterruptedException
	{
		test.typepassword(newprop.getProperty("password"));
	}
	@Test(priority=4)
	public void clickonloginbutton() throws InterruptedException
	{
		test.clickbuttonlogin();
	}
	@Test(priority=5)
	public void clickonlaptops() throws InterruptedException
	{
		test.laptop();
	}
	@Test(priority=6)
	public void chooseonelaptop() throws InterruptedException
	{
		test.chooselaptop();
	}
	@Test(priority=7)
	public void addincart() throws InterruptedException
	{
		cart.buttoncart();
	}
	@Test(priority=8)
	public void addcart()
	{
		cart.clickoncart();
	}
	@Test(priority=9)
	public void item()
	{
		cart.itemadded();
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
