package generic_library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch implements Framework_constants
{
	public static WebDriver driver;
	@BeforeMethod
	public static void openApp()
	{
		System.setProperty(gk,gv);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public static void closeApp() throws IOException
	{
		Photo.capture(driver);
		driver.quit();
	}
}
