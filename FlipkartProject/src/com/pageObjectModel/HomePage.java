package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//input[@name='q']")
	private WebElement Serach;
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement cart;
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement SeIc;
	 
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void Search(String value)
	{
		Serach.sendKeys(value);
	}
	public void cart()
	{
		cart.click();
	}
	public void SearchIcon()
	{
		SeIc.click();
	}
	
	


}
