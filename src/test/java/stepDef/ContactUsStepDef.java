package stepDef;

import cucumber.api.java.en.Then;
import pageObject.ContactUs;

public class ContactUsStepDef {

	ContactUs cu=new ContactUs();
	@Then("^Enter the name in Contact us form \"([^\"]*)\"$")
	public void enter_the_name_in_Contact_us_form(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.namevalue(arg1);
	}

	@Then("^Enter the Email in Contact us form \"([^\"]*)\"$")
	public void enter_the_Email_in_Contact_us_form(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.emailvalue(arg1);
	}

	@Then("^Enter the phone in Contact us form \"([^\"]*)\"$")
	public void enter_the_phone_in_Contact_us_form(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.phonevalue(arg1);
	}

	@Then("^Select the  Store in ContactUs Form by \"([^\"]*)\" by \"([^\"]*)\"$")
	public void select_the_Store_in_ContactUs_Form_by_by(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.storedropdown(arg1, arg2);
	}

	@Then("^Select The Contact Media$")
	public void select_The_Contact_Media() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.howContactradio();
	}

	@Then("^Select the Contact Reason \"([^\"]*)\" by \"([^\"]*)\"$")
	public void select_the_Contact_Reason_by(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.reasondropdwon(arg1, arg2);
	}

	@Then("^Enter the text Message \"([^\"]*)\"$")
	public void enter_the_text_Message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.message(arg1);
	}

	@Then("^Click on Submit button in Contact form$")
	public void click_on_Submit_button_in_Contact_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cu.submitform();
	}

	@Then("^Verify the Alert Message \"([^\"]*)\"$")
	public void verify_the_Alert_Message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
