package pompacks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClassDemo;

public class pompacklogin extends BaseClassDemo {
	
	@FindBy(id="loginusername") WebElement enterusername;
	@FindBy(id="loginpassword") WebElement enterpassword;
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]") WebElement clickloginbutton;
	@FindBy(xpath="//a[contains(text(),'Laptops')]") WebElement laptops;
	@FindBy(xpath="//a[contains(text(),'Sony vaio i5')]") WebElement sony;
	public pompacklogin()
	{
		PageFactory.initElements(driver, this);
	}
	public void log()
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("login2"))).build().perform();
		driver.findElement(By.linkText("Log in")).click();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	public void typeusername(String username) throws InterruptedException
	{
		Thread.sleep(3000);
		enterusername.sendKeys(username);
	}
	public void typepassword(String password) throws InterruptedException
	{
		Thread.sleep(3000);
		enterpassword.sendKeys(password);
	}
	public void clickbuttonlogin() throws InterruptedException
	{
		Thread.sleep(3000);
		clickloginbutton.click();
	}
	public void laptop() throws InterruptedException
	{
		Thread.sleep(3000);
		laptops.click();
	}
	public void chooselaptop() throws InterruptedException
	{
		Thread.sleep(3000);
		sony.click();
	}
	
}
