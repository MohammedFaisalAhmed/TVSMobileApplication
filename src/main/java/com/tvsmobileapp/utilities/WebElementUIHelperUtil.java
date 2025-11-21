package com.tvsmobileapp.utilities;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class WebElementUIHelperUtil 
{
	AndroidDriver driver;
	WaitUtil waitUtil;
	String currentContext;
	
	public WebElementUIHelperUtil(AndroidDriver driver)
	{
		this.driver=driver;
		waitUtil=new WaitUtil(driver);
		currentContext=driver.getContext();
		
	}
	
	public void clickWithImplicitWait(WebElement element)
	{
		waitUtil.implicitWait(driver, 30);
		element.click();
		
	}
	public void clickWithExplicitWait(WebElement element)
	{
		waitUtil.explicitWait(driver, 30, ExpectedConditions.visibilityOf(element));		
		element.click();
		
	}
	
	public void implicitWaitAndEnterText(WebElement element,String input)
	{
		waitUtil.implicitWait(driver, 30);
		element.sendKeys(input);
		element.click();
	}
	
	public void tapElement(WebElement element)
	{
		int centerX=element.getLocation().getX() + element.getSize().getWidth()/2;
		int centerY=element.getLocation().getY() + element.getSize().getHeight()/2;
		
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap=new Sequence(finger, 1);
		tap.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),centerX,centerY ));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(tap));
		
	}

}
