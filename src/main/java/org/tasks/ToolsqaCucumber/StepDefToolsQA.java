package org.tasks.ToolsqaCucumber;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefToolsQA {
	public String text;
	

	@Given("^user is on Toolsqa page$")
	public void user_is_on_Toolsqa_page() {
		Base.browserOpen();
		Base.launchApp("http://demoqa.com/registration/");

		// return obj;
	}

	@When("^user clicks on a checkbox$")
	public void user_clicks_on_a_checkbox() throws InterruptedException {
		POMToolsQARegPage obj = new POMToolsQARegPage();
		Thread.sleep(3000);
		obj.getHobbyCricket().click();
		obj.getHobbyDance().click();
		obj.getHobbyReading().click();

	}

	@Then("^user verifies whether the checkbox is selected or not$")
	public void user_verifies_whether_the_checkbox_is_selected_or_not() throws Throwable {
		POMToolsQARegPage obj = new POMToolsQARegPage();
		boolean cricket = obj.getHobbyCricket().isSelected();
		boolean dance = obj.getHobbyDance().isSelected();
		boolean reading = obj.getHobbyReading().isSelected();
		Assert.assertTrue(cricket && dance && reading);
		System.out.println("The check box are selected");
		Base.browserClose();

	}

	@When("^user clicks on the radio button$")
	public void user_clicks_on_the_radio_button() {
		POMToolsQARegPage obj = new POMToolsQARegPage();
		obj.getStatusMarried().click();
	}

	@Then("^user verifies whether the radio is selected or not$")
	public void user_verifies_whether_the_radio_is_selected_or_not() throws Throwable {
		POMToolsQARegPage obj = new POMToolsQARegPage();
		boolean selected = obj.getStatusMarried().isSelected();
		Assert.assertTrue(selected);
		System.out.println("Married radio button is selected");
		Base.browserClose();
	}

	@When("^user clicks the dropdown menu$")
	public  void user_clicks_the_dropdown_menu() {
		POMToolsQARegPage obj = new POMToolsQARegPage();
		//obj.getDropDownCountry().click();
		Select s= new Select(obj.getDropDownCountry());
		text = s.getFirstSelectedOption().getText();
		
	}

	@Then("^user verifies whether the dropdown default value is same or not$")
	public void user_verifies_whether_the_dropdown_default_value_is_same_or_not() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Afghanistan", text);
		System.out.println("The default selected value is : "+text);
		Base.browserClose();
	}

}
