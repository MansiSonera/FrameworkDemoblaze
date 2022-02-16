package pompacks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseClassDemo;

public class AddtoCart extends BaseClassDemo {
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]") WebElement addtocartbutton;
	@FindBy(id="cartur") WebElement cart;
	public AddtoCart()
	{
		PageFactory.initElements(driver, this);
	}
	public void buttoncart() throws InterruptedException 
	{
		driver.get("https://demoblaze.com/prod.html?idp_=8#");
		Thread.sleep(3000);
		addtocartbutton.click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		String alertmsg =driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		Thread.sleep(3000);
		al.accept();
	}
	public void clickoncart()
	{
		cart.click();
	}
	public void itemadded()
	{
		driver.get("https://demoblaze.com/cart.html");
		System.out.println("Item successfully added in Cart");
	}
}
