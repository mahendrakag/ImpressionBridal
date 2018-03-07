package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.Login;

public class LoginStepDef {
   
	Login lg=new Login();
	
	
	@Then("^enter the Email \"([^\"]*)\"$")
	public void enter_the_Email(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lg.Email(arg1);
	}

	@And("^enter the Password \"([^\"]*)\"$")
	public void enter_the_Password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lg.Password(arg1);

	}
	@Then("^click on homepage link on Login$")
	public void click_on_homepage_link_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lg.LoginButtonOnClick();
	}
}
