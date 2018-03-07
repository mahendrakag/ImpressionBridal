package pageObject;

import genric.SeleniumClass;


public class ForgotPass extends SeleniumClass{

	//Click on forgotPassword? link
	//LinkText Locators of forgotPassword Button link
	String LinktextForgotlink="%s";
	String XpathLink="//*[@id=\"LoginForm\"]/div[2]/a";
	public void forgotPasslink(String Forgot) throws InterruptedException
	{
		LinktextForgotlink=String.format(LinktextForgotlink, Forgot);
		super.performAction(action.click,super.identifyElement(locators.xpath, XpathLink), null);
	}
	
	//Send Value on ForgotPassword EmailInput field from cucumber
	String ValueOfEmail="%s";
	String NameOfInputEmail="Email_forgott_pass";
	public void ValueforgotEmail(String NameEmail) throws InterruptedException
	{
		ValueOfEmail=String.format(ValueOfEmail, NameEmail);
		super.performAction(action.SendKeys, super.identifyElement(locators.name, NameOfInputEmail), ValueOfEmail);
	}
	
	String XpathOfUpdateLogin="//*[@id=\"forgetPasswordForm\"]/div[1]/button";
	public void Updatelogin() throws InterruptedException
	{
		super.performAction(action.click,super.identifyElement(locators.xpath, XpathOfUpdateLogin), null);
	}
	
	

	String xpathOfAppConfirm="//*[@id=\"login-modal\"]/div/div/div/div[1]/h4";
		
		public String getTextFromElement() throws InterruptedException
		{
			return super.identifyElement(locators.css, xpathOfAppConfirm).getText();
			
		}
	
}
