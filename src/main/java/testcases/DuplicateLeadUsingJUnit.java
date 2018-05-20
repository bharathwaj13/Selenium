package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DuplicateLeadUsingJUnit extends SeMethods{
	@Test
	public void test() throws InterruptedException {
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
		WebElement emailTab = locateElement("xpath","(//a[@class='x-tab-right'])[3]");
		click(emailTab);
		Thread.sleep(2000);
		WebElement emailID = locateElement("name", "emailAddress");
		type(emailID,"iambharathwaj@gmail.com");
		Thread.sleep(2000);
		WebElement findLeadsButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(4000);
		WebElement elementFirstName = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		String firstName = getText(elementFirstName);
		click(elementFirstName);
		Thread.sleep(3000);
		WebElement duplicateLEadButton = locateElement("xpath","//a[text()='Duplicate Lead']");
		click(duplicateLEadButton);
		Thread.sleep(3000);
		WebElement sectionHeader = locateElement("xpath","//div[@class='x-panel-header sectionHeaderTitle']");
		verifyExactText(sectionHeader, "Duplicate Lead");
		WebElement submitButton = locateElement("name", "submitButton");
		click(submitButton);
		Thread.sleep(4000);
		WebElement leadFirstName = locateElement("viewLead_firstName_sp");
		verifyExactText(leadFirstName, firstName);
		
		
		
		
		
		
		
		
		
		
		
	}

}
