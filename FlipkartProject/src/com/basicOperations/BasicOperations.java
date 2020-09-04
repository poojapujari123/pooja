package com.basicOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageObjectModel.LoginPage;

public class BasicOperations implements ConstantValues 
{
	public static WebDriver driver;
	@BeforeMethod
	public static void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);
		String un=ExcelData.exceldata("Login",1,0);
		String pwd=ExcelData.exceldata("Login", 1, 1);
		lp.UserName(un);
		lp.Password(pwd);
		Thread.sleep(5000);
		lp.LoginBu();
		Thread.sleep(5000);
	}
	@AfterMethod
	public static void logout() throws IOException
	{
		TakeScreenShot.screenshot();
		driver.quit();
	}

}
