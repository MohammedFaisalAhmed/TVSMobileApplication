package com.tvsmobileapp.stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TvsLoginPageSteps extends BaseSteps
{
	AndroidDriver driver;
	/*
	@Given("click on MotorCycle button")
	public void click_on_motor_cycle_button()
	{
		tvsLoginPageActions.clickMotorCycleButton();
	   
	}*/
	
	@Given("click on {string} button")
	public void click_on_button(String vehicleType) 
	{
	   tvsLoginPageActions.clickVehicleType(vehicleType);
	}
	

}
