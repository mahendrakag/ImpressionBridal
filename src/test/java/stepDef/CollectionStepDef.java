package stepDef;

import cucumber.api.java.en.Then;
import pageObject.CollectionHomePage;

public class CollectionStepDef {

	CollectionHomePage cp=new CollectionHomePage();
	
	@Then("^click on menu link on \"([^\"]*)\"$")
	public void click_on_menu_link_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 cp.ClickOnCollection(arg1);
	}
	
	@Then("^MouseOver on menu \"([^\"]*)\"$")
	public void mouseover_on_menu(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cp.mouseOver(arg1);
	}
	@Then("^Click on DropDown Menu Collection in \"([^\"]*)\"$")
	public void click_on_DropDown_Menu_Collection_in(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   cp.clickOnWedding(arg1);
	}

	@Then("^Click on CollectionPanel Category Gowns \"([^\"]*)\"$")
	public void click_on_CollectionPanel_Category_Gowns(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   cp.collectionCategory(arg1);
	}

	@Then("^Select the checkbox type \"([^\"]*)\"$")
	public void select_the_checkbox_type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cp.checkboxtype(arg1);
	}
}
