package week6day1;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import wdMethods.ProjectMethods;

public class EditLeadUsingTestNG extends ProjectMethods {
	@BeforeClass
	public void excelName() {
		excelFileName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String fName,String cName) throws InterruptedException {
		WebElement leads = locateElement("link","Leads");
		click(leads);
		Thread.sleep(2000);
		WebElement findLeadsLink = locateElement("link","Find Leads");
		click(findLeadsLink);
		Thread.sleep(2000);
		WebElement firstName = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstName,fName);
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
		type(companyName, cName);
		WebElement submitButton = locateElement("name", "submitButton");
		click(submitButton);
		Thread.sleep(3000);
		WebElement elementCompanyName = locateElement("viewLead_companyName_sp");
		verifyPartialText(elementCompanyName, cName);
	}

}
