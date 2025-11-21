package com.tvsmobileapp.pageobjects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MotorcyclePage 
{
	AndroidDriver driver;
	
	public MotorcyclePage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)),this);
	}
	
	
	

}
