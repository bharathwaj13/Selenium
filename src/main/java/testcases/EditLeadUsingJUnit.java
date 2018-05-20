package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class EditLeadUsingJUnit extends SeMethods {
	@Test
	public void Run() throws InterruptedException {
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
