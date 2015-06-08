package com.example.tests;



//import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;






import org.junit.Test;

import com.thoughtworks.selenium.BrowserConfigurationOptions;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class GeneralCiRM {
	//Variables for Post deploymnet tests
	//can be used across methods.
	private Selenium selenium;
	
	private void ln (Object test){
		System.out.println(test);
	}
	
	//private String longPwd = "password";
	//private String pageLoadTime= "50000";
	
	
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*googlechrome C:/Program Files (x86)/Google/Chrome/Application/chrome.exe" , "http://cirm.miamidade.gov/html/login.html");
		selenium.start();
		//get profile configurations from config file. //search google on how to retrieve config settings for unit tests. 
	
	}

	
	@Test
	public void inputBy() throws Exception {
		selenium.open("http://cirm.miamidade.gov/html/login.html");
		selenium.type("id=iUsername", "c203036");
		selenium.type("id=iPassword", "Pass");
		selenium.click("id=btnLogin");
		Thread.sleep(5000);
		selenium.click("css=body > div.container_12 > div.banner.grid_12 > ul > li:nth-child(6) > a");
		selenium.type("id=createdStartDate", "-60");
		selenium.click("css=#advSearch_right > input:nth-child(1)");
		selenium.click("css=#advSearchResults > table > tbody > tr:nth-child(1) > td:nth-child(1) > a");
		selenium.click("css=body > div:nth-child(11) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button:nth-child(1) > span");
		Thread.sleep(8000);
		selenium.click("css=body > div:nth-child(12) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button > span");
		selenium.click("css=#editorDiv > div.app_container > div.right_column.grid_2 > div.activity > span:nth-child(14) > input[type=text]");
		assertTrue(selenium.isVisible("id=ui-dialog-title-sh_dialog_profile"));
		//test
	}
		

	
	
	@After
	public void tearDown() throws Exception {
// 	selenium.stop();
	}
}
