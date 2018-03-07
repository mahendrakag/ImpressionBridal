package pageObject;

import genric.SeleniumClass;


public class HomePage extends SeleniumClass {
	
	
	
	String CancelPopUpCss ="#subscribe-modal > div > div > div > a > span";
	
	public void CancelPopup() throws InterruptedException
	{
		
		super.performAction(action.click, super.identifyElement(locators.css,CancelPopUpCss ),null);
		
	}
	
	String SignInCssSelector =".sign-in-up a";
	//String FnameXpath="//input[@name='fname']";
	public void ClickOnSign() throws InterruptedException
	{	
		System.out.println("ppppp");
		//SignInPartialLink=String.format(SignInPartialLink, linkName);
		
		super.performAction(action.click,super.identifyElement(locators.css, SignInCssSelector), null);
	}
	
	String CollectionCssSelector =".text-anchor";
	public void ClickOnAppointment() throws InterruptedException
	{
		super.performAction(action.click,super.identifyElement(locators.css, CollectionCssSelector), null);
		
	}
	
	String ContactusXpath="/html/body/header/div/div[3]/div/nav/ul/li[8]/a";
	public void ContactUs() throws InterruptedException
	{
		super.performAction(action.click,super.identifyElement(locators.xpath, ContactusXpath), null);
	}
	
	
}
