package genric;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class SeleniumClass extends BaseClass {

		 static WebDriver driver;
		protected enum locators{id,name,className,tagName,LinkText, partiallinkText,xpath,css};
		protected enum action {click,selectByindex,selectByValue,selectbyvisibleText,SendKeys,checkbox,Actions};
		public void launchBrowser(String browserName)
		{
			String path=super.getAndConcatCurrentPath("\\src\\test\\java\\Drivers\\");
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",path+"chromedriver.exe");
				driver =new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver",path+"IEDriverServer.exe");
				driver =new InternetExplorerDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
		}
		public void lanuchUrl(String url)
		{
			driver.get(url);
		}
		public String getPageDetails(String type)
		{
			String actual =null;
			if(type.equalsIgnoreCase("title"))
			{
				actual =driver.getTitle();
			}
			else if(type.equalsIgnoreCase("url"))
			{
				actual =driver.getCurrentUrl();
			}
			else if(type.equalsIgnoreCase("handle"))
			{
				actual =driver.getWindowHandle();
			}
			else if(type.equalsIgnoreCase("source"))
			{
				actual =driver.getPageSource();
			}
			return actual;
		}
		public void closeBrowser()
		{
			driver.close();
		}
		public void TakeScreenshot(String name)
		{
			//long ctime= System.currentTimeMillis();
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dstfile =new File(super.getAndConcatCurrentPath("\\src\\test\\java\\Screenshots\\"+name+".png"));
		try {
			FileUtils.copyFile(file, dstfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		public WebElement identifyElement(locators type,String value) throws InterruptedException
		{
			
			
			switch(type) {
			case id			:return driver.findElement(By.id(value));
			case name		:return driver.findElement(By.name(value));
			case className	:return driver.findElement(By.className(value));
			case tagName	:return driver.findElement(By.tagName(value));
			case LinkText	:return driver.findElement(By.linkText(value));
			case partiallinkText:return driver.findElement(By.partialLinkText(value));
			case xpath		:return driver.findElement(By.xpath(value));
			case css		:return driver.findElement(By.cssSelector(value));
			
		
			}
			return null;
			
		}
		public void performAction(action type,WebElement element,String value) throws InterruptedException
		{
			Thread.sleep(5000);
			Select sel;
		   
			switch(type)
			{
				case click			:element.click();
							break;
				case selectByindex	: sel =new  Select(element);
					sel.selectByIndex(Integer.parseInt(value));
							break;
				case selectByValue	:	sel =new  Select(element);
					sel.selectByValue(value);
							break;
				case selectbyvisibleText: sel =new  Select(element);
					sel.selectByVisibleText(value);	
							break;
				case SendKeys : element.sendKeys(value); 		
							break;
				
				case Actions : Actions builder = new Actions(driver);
				builder.moveToElement(element).build().perform();
					}
				}
			
		
	}
