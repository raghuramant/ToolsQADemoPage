Feature: CheckBox, radio button and dropdown verfication

Background: 
Given user is on Toolsqa page

Scenario: verifying checkbox

When user clicks on a checkbox
Then user verifies whether the checkbox is selected or not

Scenario: verifying radio button

When user clicks on the radio button
Then user verifies whether the radio is selected or not

Scenario: verifying dropdown default text

When user clicks the dropdown menu
Then user verifies whether the dropdown default value is same or not
