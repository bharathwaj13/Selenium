package week6day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class DeleteLeadUsingTestNG extends ProjectMethods {
	@BeforeClass
	public void excelName() {
		excelFileName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String mobileNumber) throws InterruptedException {
		WebElement leads = locateElement("link","Leads");
		click(leads);
		Thread.sleep(2000);
		WebElement findLeadsLink = locateElement("link","Find Leads");
		click(findLeadsLink);
		Thread.sleep(2000);
		WebElement phoneTab = locateElement("xpath","(//a[@class='x-tab-right'])[2]");
		click(phoneTab);
		Thread.sleep(2000);
		WebElement phoneNumber = locateElement("xpath","//input[@name='phoneNumber']");
		type(phoneNumber, mobileNumber);
		WebElement findLeadsButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(4000);
		WebElement elementLeadID = locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String leadID = getText(elementLeadID);
		System.out.println(leadID);
		click(elementLeadID);
		Thread.sleep(3000);
		WebElement deleteButton = locateElement("class", "subMenuButtonDangerous");
		click(deleteButton);
		Thread.sleep(3000);
		WebElement findLeadsPage = locateElement("link", "Find Leads");
		click(findLeadsPage);
		Thread.sleep(2000);
		WebElement leadIDEdit = locateElement("xpath","//div[@class='x-form-element']/input[@name='id']");
		type(leadIDEdit,leadID);
		WebElement findLeadsButton1 = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton1);
		Thread.sleep(4000);
		WebElement noRecordsError=locateElement("xpath","//div[text()='No records to display']");
		verifyDisplayed(noRecordsError);
		
	}

}
