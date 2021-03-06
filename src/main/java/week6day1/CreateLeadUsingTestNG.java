package week6day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class CreateLeadUsingTestNG extends ProjectMethods{
	//	@Test(invocationCount=2,timeOut=100000,priority=-1)
	@BeforeClass
	public void excelName() {
		excelFileName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String companyname,String firstname, String lastname) throws InterruptedException {
		WebElement leads = locateElement("link","Leads");
		click(leads);
		WebElement createLead = locateElement("link","Create Lead");
		click(createLead);
		Thread.sleep(3000);
		WebElement companyName = locateElement("id","createLeadForm_companyName");
		type(companyName,companyname);
		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,firstname);
		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,lastname);
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
	/*@DataProvider(name="fetchData")
	public Object[][] getData(){

		Object[][] data= new Object[2][4];
		data[0][0]= "IBM";
		data[0][1]= "Abhinav";
		data[0][2]= "V";
		data[0][3]= "9995326013";

		data[1][0]= "TCS";
		data[1][1]= "Bharthwaj";
		data[1][2]= "P";
		data[1][3]= "8128908765";
		return data;


	}*/

	

}



