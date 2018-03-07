package pageObject;

import genric.SeleniumClass;



public class Appointment extends SeleniumClass {
	
	
	String CssFilterPulsIcon=".panel-title>a:before";
	public void ClickOnFilterCollection() throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.css, CssFilterPulsIcon), null);
	}
	
	String NameLinktext="%s";
	String XnameName="name";
	public void enterName(String Name) throws InterruptedException
	{
		NameLinktext=String.format(NameLinktext, Name);
		super.performAction(action.SendKeys, super.identifyElement(locators.name, XnameName), NameLinktext);
	}
	
	String EmailLinktext="%s";
	String XemailName="//*[@id=\"appointment_form\"]/div/div[3]/input";
	public void enterEmail(String Name) throws InterruptedException
	{
		EmailLinktext=String.format(EmailLinktext, Name);
		super.performAction(action.SendKeys, super.identifyElement(locators.xpath, XemailName), EmailLinktext);
	}
	
	String PhoneNo="%s";
	String PhoneNoXpath="phone";
	public void Phone(String linkName) throws InterruptedException
	{
		PhoneNo=String.format(PhoneNo, linkName);
		super.performAction(action.SendKeys,super.identifyElement(locators.name, PhoneNoXpath), PhoneNo);
	}
	
	String XpathDropdown="//*[@id=\"appointment_form\"]/div/div[5]/select";
	public void StoreDropdown(String value,String type) throws InterruptedException
	{
		super.performAction(action.selectByindex,super.identifyElement(locators.xpath, XpathDropdown), value);
	}

	String Day="%s";
	String Xpathday="/html/body/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[2]";
	
	public void EnterDay(String day) throws InterruptedException
	{
		Day=String.format(Day, day);
		
		
		super.performAction(action.click,super.identifyElement(locators.xpath, Xpathday), Day);
		
	}
	String XpathDate="//*[@id=\"wedding-day\"]";
	String xpathmonth="/html/body/div[3]/div[1]/div[2]/table/thead/tr[1]/th[2]/select[1]";
	public void selectMonth(String value,String type) throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, XpathDate), null);
		super.performAction(action.selectByValue,super.identifyElement(locators.xpath, xpathmonth), value);
	}
	
	
	String xpathyear="/html/body/div[3]/div[1]/div[2]/table/thead/tr[1]/th[2]/select[2]";
	public void selectyear(String value,String type) throws InterruptedException
	{
		
		super.performAction(action.selectByValue,super.identifyElement(locators.xpath, xpathyear), value);
	}
	
	String XpathOfBrand="//*[@id=\"appointment_form\"]/div/div[7]/label[3]/input";
	public void  radiobutton() throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, XpathOfBrand), null);
	}
	
	String DateXpath="//*[@id=\"app-day\"]";
	String monthXpath="/html/body/div[4]/div[1]/div[2]/table/thead/tr[1]/th[2]/select[1]";
	public void monthApp(String value,String type) throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, DateXpath), null);
		super.performAction(action.selectByValue, super.identifyElement(locators.xpath, monthXpath), value);
	}
	String yearXpath="/html/body/div[4]/div[1]/div[2]/table/thead/tr[1]/th[2]/select[2]";
	public void yearapp(String value,String type) throws InterruptedException
	{
		super.performAction(action.selectByValue, super.identifyElement(locators.xpath, yearXpath), value);
	}
	String DayXpath="/html/body/div[4]/div[1]/div[2]/table/tbody/tr[2]/td[5]";
	public void dayApp(String day) throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, DayXpath), day);
	}
	
	String Message="%s";
	String XpathMessage="//*[@id=\"appointment_form\"]/div/div[12]/textarea";
	
	public void enterMessage(String message) throws InterruptedException
	{
		Message=String.format(Message, message);
		super.performAction(action.SendKeys, super.identifyElement(locators.xpath, XpathMessage), Message);
	}
	
	String Xpathsubmit="//*[@id=\"appointment_form\"]/div/div[13]/button";
	public void ClickOnSubmit() throws InterruptedException
	{
		super.performAction(action.click, super.identifyElement(locators.xpath, Xpathsubmit), null);
	}
	
	
	String xpathOfAppConfirm=".alert-danger";
		
		public String getTextFromElement() throws InterruptedException
		{
			return super.identifyElement(locators.css, xpathOfAppConfirm).getText();
			
		}
	
	
}
