package pageObject;

import genric.SeleniumClass;

public class ContactUs extends SeleniumClass {
	
		String name="%s";
		String NameOfname="name";
		public void namevalue(String linkname) throws InterruptedException
		{
			name=String.format(name, linkname);
			super.performAction(action.SendKeys,super.identifyElement(locators.name, NameOfname), name);
		}
		
		String email="%s";
		String XpathEmail="//*[@id=\"contact_us_form\"]/div/div[3]/input";
		public void emailvalue(String emaillink) throws InterruptedException
		{
			email=String.format(email, emaillink);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, XpathEmail), email);
		}
		
		String phone="%s";
		String XpathOfphone="//*[@id=\"contact_us_form\"]/div/div[4]/input";
		public void phonevalue(String phonelink) throws InterruptedException
		{
			phone=String.format(phone, phonelink);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, XpathOfphone), phone);
		}
		
		String SelectStroe="%s";
		String XpathDropdown="//*[@id=\"contact_us_form\"]/div/div[5]/select";
		public void storedropdown(String value,String type) throws InterruptedException
		{
			//SelectStroe=String.format(SelectStroe, storelink);
			super.performAction(action.selectByindex,super.identifyElement(locators.xpath, XpathDropdown), value);
		}
		
		String HowContactXpath="//*[@id=\"contact_us_form\"]/div/div[6]/label[2]/input";
		public void howContactradio() throws InterruptedException
		{
			super.performAction(action.click,super.identifyElement(locators.xpath, HowContactXpath), null);
		}
		String reason="%s";
		String reasonxpath="//*[@id=\"contact_us_form\"]/div/div[7]/select";
		public void reasondropdwon(String value,String type) throws InterruptedException
		{
			//reason=String.format(reason, reasonlink);
			super.performAction(action.selectByindex,super.identifyElement(locators.xpath, reasonxpath), value);
		}
		
		String message="%s";
		String xpathmessage="//*[@id=\"contact_us_form\"]/div/div[8]/textarea";
		public void message(String message) throws InterruptedException
		{
			message=String.format(message, message);
			super.performAction(action.SendKeys,super.identifyElement(locators.xpath, xpathmessage), message);
		}
		
		String Submitxpath="//*[@id=\"contact_us_form\"]/div/div[9]/button";
		public void submitform() throws InterruptedException
		{
			super.performAction(action.click,super.identifyElement(locators.xpath, Submitxpath), null);
		}

}
