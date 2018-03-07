package pageObject;

import genric.SeleniumClass;



public class Login extends SeleniumClass {

	
	String Email="%s";
	String EmailXpath="//form[@id='LoginForm']/input[@id='inputEmail']";
	public void Email(String linkName) throws InterruptedException
	{
		Email=String.format(Email, linkName);
		super.performAction(action.SendKeys,super.identifyElement(locators.xpath, EmailXpath), Email);
	}
	
	String Password="%s";
	String PasswordXpath="//form[@id='LoginForm']/input[@id='inputPassword']";
	public void Password(String linkName) throws InterruptedException
	{
		Password=String.format(Password, linkName);
		super.performAction(action.SendKeys,super.identifyElement(locators.xpath, PasswordXpath), Password);
	}
	String XpathloginButton="//form[@id='LoginForm']/div/button";
	public void LoginButtonOnClick() throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, XpathloginButton), null);
	}
}
