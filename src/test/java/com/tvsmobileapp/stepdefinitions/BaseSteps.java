package com.tvsmobileapp.stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tvsmobileapp.pageactions.TvsLoginPageActions;
import com.tvsmobileapp.utilities.DriverfactoryUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;



public class BaseSteps 
{
	public AndroidDriver driver;
	protected TvsLoginPageActions tvsLoginPageActions;
	
	public BaseSteps() 
	{
		this.driver=DriverfactoryUtil.getDriver();
		initializePages();
	}
	
	public void initializePages()
	{
		tvsLoginPageActions=new TvsLoginPageActions(driver);
	}
	

	
	

}
