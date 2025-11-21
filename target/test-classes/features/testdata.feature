@Regression
Feature: TVS Mobile App

@test1
Scenario Outline: Open the app and work on it
Given click on "<VehicleType>" button
#When User click on Book a test ride button

Examples:
| VehicleType |
| motercycles |
| electric     |