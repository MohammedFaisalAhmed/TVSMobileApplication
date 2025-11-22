package com.tvsmobileapp.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;




public class TvsLoginPage
{
	
     AndroidDriver driver;
	
	public TvsLoginPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	//added comments3
	
	/*public WebElement getMotorcycle() 
	{
		return motorcycle;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.tvsm.connect:id/motercycles\")")
	private WebElement motorcycle;
	
	*/
	
	public WebElement getVehicleType(String vehicleType)
	{
		String locator = "new UiSelector().resourceId(\"com.tvsm.connect:id/" + vehicleType + "\")";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator(locator)));
	}
	/*
	public WebElement getVehicleType(String vehicleType) 
	{
		return driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.tvsm.connect:id/" + vehicleType + "\")"));
	}*/

}
