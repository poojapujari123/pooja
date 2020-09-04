package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Test;

import com.basicOperations.BasicOperations;
import com.basicOperations.ExcelData;
import com.pageObjectModel.HomePage;

public class SearchingMobile extends BasicOperations

{
	@Test
	public static void mobile() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		String search_value=ExcelData.exceldata("HomeScreen", 1, 0);
		hp.Search(search_value);
		hp.SearchIcon();
	}
	

}

