package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLeadUsingJUnit extends SeMethods {
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
		WebElement mergeLead = locateElement("link","Merge Leads");
		click(mergeLead);
		Thread.sleep(3000);
		String firstWindowHandle=getwindowHandle();
		WebElement fromLead = locateElement("xpath","//table[@id='widget_ComboBox_partyIdFrom']/following::a");
		click(fromLead);
		Thread.sleep(2000);
		switchToWindow(1);
		Thread.sleep(2000);
//		getActiveURL();
		/*WebElement leadIDtext = locateElement("xpath","//input[@class=' x-form-text x-form-field ']");
//		WebElement leadIDtext = locateElement("xpath","//div[@class='x-form-element']/input']");
		type(leadIDtext,"10113");*/
		WebElement leadIDtext = locateElement("xpath","//div[starts-with(@id,'x-form-el-ext-gen')]/input");
		type(leadIDtext,"10214");
		WebElement findLeadsButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton);
		Thread.sleep(2000);
		WebElement firstLink = locateElement("xpath","//table[@class='x-grid3-row-table']//a");
		clickWithNoSnap(firstLink);
//		click(firstLink);
		Thread.sleep(3000);
//		switchToWindow(firstWindowHandle);
		switchToWindow(0);
		WebElement toLead = locateElement("xpath","//table[@id='widget_ComboBox_partyIdTo']/following::a");
		click(toLead);
		Thread.sleep(2000);
		switchToWindow(1);
		Thread.sleep(2000);
		WebElement toleadIDText = locateElement("xpath","//div[starts-with(@id,'x-form-el-ext-gen')]/input");
		type(toleadIDText,"10217");
		WebElement findToLeadsButton = locateElement("xpath","//button[text()='Find Leads']");
		click(findToLeadsButton);
		Thread.sleep(2000);
		WebElement firstLeadLink = locateElement("xpath","//table[@class='x-grid3-row-table']//a");
//		click(firstLeadLink);
		clickWithNoSnap(firstLeadLink);
		Thread.sleep(3000);
		switchToWindow(0);
//		switchToWindow(firstWindowHandle);
		WebElement mergeLeadsButton = locateElement("class", "buttonDangerous");
		clickWithNoSnap(mergeLeadsButton);
		Thread.sleep(2000);
		acceptAlert();
		Thread.sleep(3000);
		WebElement findLeadsLink = locateElement("link","Find Leads");
		click(findLeadsLink);
		Thread.sleep(2000);
		WebElement enterleadIDText = locateElement("xpath","(//div[@class='x-form-element'])[18]/input");
		type(enterleadIDText,"10214");
		WebElement findLeadsButton1 = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeadsButton1);
		Thread.sleep(2000);
		WebElement noRecordsError=locateElement("xpath","//div[text()='No records to display']");
		verifyDisplayed(noRecordsError);
		
		
	}

}
