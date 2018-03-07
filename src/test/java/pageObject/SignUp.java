package pageObject;

import genric.SeleniumClass;


public class SignUp extends SeleniumClass{
	
		 String SignUplinkText ="%s";
		 
		public void ClickOnSignUp1(String linkName) throws InterruptedException {
			// TODO Auto-generated method stub
			SignUplinkText=String.format(SignUplinkText, linkName);
			 super.performAction(action.click,super.identifyElement(locators.LinkText, SignUplinkText), null);
		}

		String Fname="%s";
		String FnameXpath="//input[@id='inputFname']";
		public void Fname(String linkName) throws InterruptedException
		{
			Fname=String.format(Fname, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, FnameXpath), Fname);
		}
		String Lname="%s";
		String lnameXpath="//input[@id='inputLname']";
		public void lname(String linkName) throws InterruptedException
		{
			Lname=String.format(Lname, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, lnameXpath), Lname);
		}
		String Email="%s";
		String Emailname="email";
		public void Email(String linkName) throws InterruptedException
		{
			Email=String.format(Email, linkName);
			System.out.println("helo"+Email);
			super.performAction(action.SendKeys,super.identifyElement(locators.name, Emailname), Email);
		}
		String PhoneNo="%s";
		String PhoneNoXpath="//input[@id='inputPhone']";
		public void PhoneNo(String linkName) throws InterruptedException
		{
			PhoneNo=String.format(PhoneNo, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, PhoneNoXpath), PhoneNo);
		}
		
		String Password="%s";
		String PasswordXpath="//form[@id='registerForm']/input[@id='inputPassword']";
		public void Password(String linkName) throws InterruptedException
		{
			Password=String.format(Password, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, PasswordXpath), Password);
		}
		String ConfirmPassword="%s";
		String ConfirmPasswordXpath="//input[@id='inputPasswordCheck']";
		public void ConfirmPassword(String linkName) throws InterruptedException
		{
			ConfirmPassword=String.format(ConfirmPassword, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, ConfirmPasswordXpath), ConfirmPassword);
		}
		
		String ZipCode="%s";
		String ZipCodedXpath="//input[@id='inputZip']";
		public void ZipCode(String linkName) throws InterruptedException
		{
			ZipCode=String.format(ZipCode, linkName);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, ZipCodedXpath), ZipCode);
		}
		
		String CssOfSignUp="//*[@id=\"registerForm\"]/div[2]/button";
		public void SignUp() throws InterruptedException
		{
			super.performAction(action.click, super.identifyElement(locators.xpath, CssOfSignUp), null);
		}
		
		String CssCloseRegPage="#login-modal > div > div > div > a > span";
		
		
		public void CloseReg() throws InterruptedException
		{
			super.performAction(action.click, super.identifyElement(locators.css, CssCloseRegPage), null);
		}
		
}
