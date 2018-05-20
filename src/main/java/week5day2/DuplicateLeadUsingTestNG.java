package week5day2;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class DuplicateLeadUsingTestNG extends ProjectMethods{
	@Test
	public void duplicateLead() throws InterruptedException {
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
