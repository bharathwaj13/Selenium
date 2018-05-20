package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLeadUsingJUnit extends SeMethods{
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
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName,"test");
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,"Bharathwaj");
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,"lastname");
		WebElement dataSource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(dataSource,"Employee");
		Thread.sleep(2000);
		WebElement market = locateElement("id","createLeadForm_marketingCampaignId");
//		selectDropDownUsingText(market,"Road and Track");
		selectDropDownUsingIndex(market,1);
		WebElement firstNamelocal = locateElement("id","createLeadForm_firstNameLocal");
		type(firstNamelocal,"firstNameLocal");
		WebElement lastNamelocal = locateElement("id","createLeadForm_lastNameLocal");
		type(lastNamelocal,"lastNameLocal");
		WebElement personalTitle = locateElement("id","createLeadForm_personalTitle");
		type(personalTitle,"MR");
		WebElement profTitle = locateElement("id","createLeadForm_generalProfTitle");
		type(profTitle,"profTitle");
		WebElement tickerSymbol = locateElement("createLeadForm_tickerSymbol");
		type(tickerSymbol,"456");
		WebElement primaryPhoneNum = locateElement("createLeadForm_primaryPhoneNumber");
		type(primaryPhoneNum,"8148981817");
		WebElement primaryEmail = locateElement("createLeadForm_primaryEmail");
		type(primaryEmail,"iambharathwaj@gmail.com");
		WebElement submit = locateElement("class","smallSubmit");
		click(submit);
	}
	
	

}
