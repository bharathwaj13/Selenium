package week4day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LearnException extends SeMethods {
	@Test
	public void run() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
		WebElement leads = locateElement("link","Leads");
		click(leads);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		Thread.sleep(3000);
		WebElement dataSource = locateElement("id","createLeadForm_dataSourceId");
		verifyExactAttribute(dataSource,"href","size");
//		selectDropDownUsingIndex(dataSource,20);
//		type(dataSource,"test");
		closeAllBrowsers();
		closeBrowser();
//		verifyTitle("verify");
		
	}

}
