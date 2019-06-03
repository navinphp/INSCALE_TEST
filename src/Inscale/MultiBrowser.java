package Inscale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	
	public  void openBrowser(String browser)
	{
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver =new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","browsers//chromedriver");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("opera"))
			{
				System.setProperty("webdriver.opera.driver","browsers//operedriver");
				driver = new OperaDriver();
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.IE.driver","browsers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else if(browser.equalsIgnoreCase("safari"))
			{
				driver = new SafariDriver();
			}
		driver.manage().window().maximize();
		driver.get("https://www.topdanmark.dk/");
		driver.quit();
		
	}

}
