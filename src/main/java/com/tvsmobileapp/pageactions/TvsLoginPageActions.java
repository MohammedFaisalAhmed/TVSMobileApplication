package com.tvsmobileapp.pageactions;

import com.tvsmobileapp.pageobjects.TvsLoginPage;
import com.tvsmobileapp.utilities.WebElementUIHelperUtil;

import io.appium.java_client.android.AndroidDriver;

public class TvsLoginPageActions 
{
	TvsLoginPage tvsLoginPage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public TvsLoginPageActions(AndroidDriver driver)
	{
		tvsLoginPage=new TvsLoginPage(driver);
		webElementUIHelperUtil=new WebElementUIHelperUtil(driver);
		
	}
	//added comments4
	
	/*public void clickMotorCycleButton()
	{
		webElementUIHelperUtil.clickWithImplicitWait(tvsLoginPage.getMotorcycle());
	}*/
	
	public void clickVehicleType(String vehicleType)
	{
		webElementUIHelperUtil.clickWithImplicitWait(tvsLoginPage.getVehicleType(vehicleType));
	}
	
	

}
