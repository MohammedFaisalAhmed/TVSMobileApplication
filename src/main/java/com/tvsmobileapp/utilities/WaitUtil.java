package com.tvsmobileapp.utilities;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil
{
	
	AndroidDriver driver;
	
	public WaitUtil(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void implicitWait(AndroidDriver driver, long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		
}
	public <T> void explicitWait(AndroidDriver driver, long waitTime, ExpectedCondition<T> expCon)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		wait.until(expCon);
	}
	
	
}