package POM_library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn;
	
	public LoginPage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void enterEmail(String s)
	{
		email.sendKeys(s);
	}
	
	public void enterPassword(String s)
	{
		pwd.sendKeys(s);
	}
	
	public void clickLogin()
	{
		btn.click();
	}
}
