package stepDef;

import cucumber.api.java.en.*;
import pageObject.SignUp;

public class SignUpStepDef {
	
	SignUp su=new SignUp();
	
	
	@Then("^click on homepage link on \"([^\"]*)\"$")
	public void click_on_homepage_link_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    su.ClickOnSignUp1(arg1);
	}

	@Then("^enter the FirstName \"([^\"]*)\" in Firstname field$")
	public void enter_the_FirstName_in_Firstname_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		su.Fname(arg1);
	}

	@Then("^enter the LastName \"([^\"]*)\" in Lastname field$")
	public void enter_the_LastName_in_Lastname_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		su.lname(arg1);
	}

	@Then("^enter the Email \"([^\"]*)\" in Email field$")
	public void enter_the_Email_in_Email_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    su.Email(arg1);
	}

	@Then("^enter the PhoneNo \"([^\"]*)\" in PhoneNo field$")
	public void enter_the_PhoneNo_in_PhoneNo_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   su.PhoneNo(arg1);
	}

	@Then("^enter the Password \"([^\"]*)\" in Password field$")
	public void enter_the_Password_in_Password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   su.Password(arg1);
	}

	@Then("^enter the ConfirmPassword \"([^\"]*)\" in ConfirmPassword field$")
	public void enter_the_ConfirmPassword_in_ConfirmPassword_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    su.ConfirmPassword(arg1);
	}

	@Then("^enter the ZipCode \"([^\"]*)\" in ZipCode field$")
	public void enter_the_ZipCode_in_ZipCode_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   su.ZipCode(arg1);
	}

	@Then("^Click on SignUp Button$")
	public void click_on_SignUp_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   su.SignUp();
	}
	
	@Then("^Click on Close the Registration Page$")
	public void click_on_Close_the_Registration_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   su.CloseReg();
	}
}
