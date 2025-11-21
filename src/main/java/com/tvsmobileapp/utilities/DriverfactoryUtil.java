package com.tvsmobileapp.utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverfactoryUtil 
{
	private static AndroidDriver driver;
	static AppiumDriverLocalService service;
	
	public static AndroidDriver getDriver()
	{
		if(driver==null)
{
	initializeDriver();
}
		return driver;
		
	}
	
	public static void initializeDriver()
	{
		
		try
		{
			
 service =new AppiumServiceBuilder()
.withAppiumJS(new File("C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
.withIPAddress("127.0.0.1")
.usingPort(4723).build();
			service.start();
					
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("appium:deviceName", "Xiaomi M2103K19PI");
            caps.setCapability("appium:udid", "z9roq859hmmnrkg6");
            caps.setCapability("appium:platformName", "Android");
            caps.setCapability("appium:platformVersion", "13");
            caps.setCapability("appium:automationName", "UiAutomator2");
            caps.setCapability("appium:appPackage", "com.tvsm.connect");
            caps.setCapability("appium:appActivity", "com.tvsm.connect.onboarding.ui.onBoarding.OnBoardingActivityNew");
            caps.setCapability("appium:autoGrantPermissions", true);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);

        } 
		catch (MalformedURLException e) 
		{
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize Appium driver: " + e.getMessage());
        }
    }

    public static void closeDriver()
    {
        if (driver != null)
        {
            driver.quit();
            driver = null;
        }
     if(service!= null)
        {
        	service.stop();
        }
    }
}
	
		
		
