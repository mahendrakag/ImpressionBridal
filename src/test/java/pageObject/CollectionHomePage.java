package pageObject;

import genric.SeleniumClass;

public class CollectionHomePage extends SeleniumClass {
	
	String XpathOfCollection="//ul[@class='menu']/li/a[contains(text(),'%s')]";
	public void ClickOnCollection(String linkName) throws InterruptedException
	{
		XpathOfCollection=String.format(XpathOfCollection, linkName);
		super.performAction(action.click, super.identifyElement(locators.xpath, XpathOfCollection), null);
	}
	
	public void mouseOver(String linkName) throws InterruptedException
	{
		XpathOfCollection=String.format(XpathOfCollection, linkName);
		super.performAction(action.Actions, super.identifyElement(locators.xpath, XpathOfCollection), null);
	}

	String DropdownXpathOfMenu="//ul[@class='menu']/li/ul/li/a[contains(text(),'%s')]";
	
	public void clickOnWedding(String linkName) throws InterruptedException
	{
		DropdownXpathOfMenu=String.format(DropdownXpathOfMenu, linkName);
		super.performAction(action.click, super.identifyElement(locators.xpath, DropdownXpathOfMenu), null);
	}
	String PanelTitleCategory="//h5/a[contains(text(),'%s')]";
	public void collectionCategory(String linkName) throws InterruptedException
	{
		PanelTitleCategory=String.format(PanelTitleCategory, linkName);
		super.performAction(action.click, super.identifyElement(locators.xpath, PanelTitleCategory), null);
	}
	String XpathCheckbox="//input[@class='cradio ml-0']/following::label[contains(text(),'%s')]";
	public void checkboxtype(String linkName) throws InterruptedException
	{
		XpathCheckbox=String.format(XpathCheckbox, linkName);
		super.performAction(action.click, super.identifyElement(locators.xpath, XpathCheckbox), null);
	}
	
}
