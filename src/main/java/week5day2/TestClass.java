package week5day2;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TestClass extends ProjectMethods{
	@Test
	public void createLead() throws InterruptedException, IOException {
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
	@Test
	public void editLead() throws InterruptedException {
		WebElement leads = locateElement("link","Leads");
		click(leads);
		Thread.sleep(2000);
		WebElement findLeadsLink = locateElement("link","Find Leads");
		click(findLeadsLink);
		Thread.sleep(2000);
		WebElement firstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstName,"Bharathwaj");
		WebElement findLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(3000);
		WebElement firstLink = locateElement("xpath", "//table[@class='x-grid3-row-table']//a");
		click(firstLink);
		WebElement viewLeadHeader = locateElement("xpath", "//div[text()='View Lead']");
		verifyExactText(viewLeadHeader, "View Lead");
		WebElement editButton = locateElement("xpath", "//a[text()='Edit']");
		click(editButton);
		Thread.sleep(3000);
		WebElement companyName = locateElement("updateLeadForm_companyName");
		clearText(companyName);
		type(companyName, "TCS");
		WebElement submitButton = locateElement("name", "submitButton");
		click(submitButton);
		Thread.sleep(3000);
		WebElement elementCompanyName = locateElement("viewLead_companyName_sp");
		verifyPartialText(elementCompanyName, "TCS");
				
	}
}
