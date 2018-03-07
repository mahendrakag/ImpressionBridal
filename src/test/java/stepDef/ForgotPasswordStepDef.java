package stepDef;

import cucumber.api.java.en.Then;
import pageObject.ForgotPass;

public class ForgotPasswordStepDef {
	
ForgotPass fp=new ForgotPass();
	
	@Then("^Click on Forgot Password link \"([^\"]*)\"$")
	public void click_on_Forgot_Password_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fp.forgotPasslink(arg1);
	}

	@Then("^Enter the Email-Id \"([^\"]*)\"$")
	public void enter_the_Email_Id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fp.ValueforgotEmail(arg1);
	}
	
	@Then("^Click on Update login Button$")
	public void click_on_Update_login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   fp.Updatelogin();
	}
	
	@Then("^verify text as a label \"([^\"]*)\"$")
	public void verify_text_as_a_label(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual = fp.getTextFromElement();
		fp.assertResult(actual, arg1);
	}
	

}
