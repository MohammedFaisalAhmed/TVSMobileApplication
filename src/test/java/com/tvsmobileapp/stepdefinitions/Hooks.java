package com.tvsmobileapp.stepdefinitions;

import java.net.MalformedURLException;

import com.tvsmobileapp.utilities.DriverfactoryUtil;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseSteps
{
public AndroidDriver driver;



@Before
public void setUp()
{
	this.driver=DriverfactoryUtil.getDriver();
}
	
@After
public void tearDown()
{
	
	DriverfactoryUtil.closeDriver();
}
}
