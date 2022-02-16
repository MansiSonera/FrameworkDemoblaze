package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilstime.timings;

public class BaseClassDemo {

	public static Properties newprop=new Properties();
	public static WebDriver driver;
	
	 public BaseClassDemo()
	 {
		 try {
			FileInputStream file=new FileInputStream("C:\\Users\\msone\\eclipse-workspace\\MavenDemoFramework\\src\\test\\java\\environmentconfig\\Configurationconfig.properties");
			newprop.load(file);
		 } 
		
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
		 catch (IOException a) {
			 a.printStackTrace();
		 }
	}
	public static void initiatebrowser()
	{
		String browsernames=newprop.getProperty("browser");
		if(browsernames.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browsernames.equals("chrome"));
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(timings.times, TimeUnit.SECONDS);
		driver.get(newprop.getProperty("url"));
	}
}
