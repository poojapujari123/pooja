package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement un;
    @FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
    private WebElement pwd;
    @FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
    private WebElement login;
    @FindBy(xpath="//a[@class='_21JmK0 _1__46T']")
    private WebElement forgot;
    @FindBy(xpath="//button[text()='Request OTP']")
    private WebElement request;
    
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void UserName(String uid )
    {
    	un.sendKeys(uid);
    }
    public void Password(String password)
    {
    	pwd.sendKeys(password);
    }
    public void LoginBu()
    {
    	login.click();
    }
    public void forgotpass()
    {
    	forgot.click();
    }
    public void requestotp()
    {
    	request.click();
    }
    

}
