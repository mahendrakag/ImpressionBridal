package stepDef;

import cucumber.api.java.en.Then;
import pageObject.Appointment;

public class AppointmentStepDef {
	
	Appointment cl=new Appointment();
	@Then("^enter the Name \"([^\"]*)\" in name field$")
	public void enter_the_Name_in_name_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 cl.enterName(arg1);   
	}
	
	@Then("^enter the EmailId \"([^\"]*)\"$")
	public void enter_the_EmailId(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   cl.enterEmail(arg1);
	}

	
	@Then("^enter the Phone \"([^\"]*)\"$")
	public void enter_the_Phone(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cl.Phone(arg1);
	}
	
		
		@Then("^select value form dropdown \"([^\"]*)\" by \"([^\"]*)\"$")
		public void select_value_form_dropdown_by(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   cl.StoreDropdown(arg1, arg2);
		}
		
		@Then("^enter the Event month \"([^\"]*)\" by \"([^\"]*)\"$")
		public void enter_the_Event_month_by(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   cl.selectMonth(arg1,arg2);
		}
		
		@Then("^enter the Event year \"([^\"]*)\" by \"([^\"]*)\"$")
		public void enter_the_Event_year_by(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   cl.selectyear(arg1, arg2);
		}
		@Then("^enter the Event day \"([^\"]*)\"$")
		public void enter_the_Event_day(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    cl.EnterDay(arg1);
		}
		
		@Then("^Select the raduio button$")
		public void select_the_raduio_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    cl.radiobutton();
		}
		
		
		
		

		@Then("^enter the Appointment month \"([^\"]*)\" by \"([^\"]*)\"$")
		public void enter_the_Appointment_month_by(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  cl.monthApp(arg1, arg2);
		}

		@Then("^enter the Appointment year \"([^\"]*)\" by \"([^\"]*)\"$")
		public void enter_the_Appointment_year_by(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 cl.yearapp(arg1,arg2);
		}
		@Then("^enter the Appointment day \"([^\"]*)\"$")
		public void enter_the_Appointment_day(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  cl.dayApp("11");
		}
		
		@Then("^Enter the Message \"([^\"]*)\"$")
		public void enter_the_Message(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    cl.enterMessage(arg1);
		}
		
		@Then("^Click on Submit$")
		public void click_on_Submit() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 cl.ClickOnSubmit();
		}
		
		
		@Then("^verify text as \"([^\"]*)\"$")
		public void verify_text_as(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String actual = cl.getTextFromElement();
				cl.assertResult(actual, arg1);
		}


	
}



