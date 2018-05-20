package week2day2hw;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-infobars");
//		op.setHeadless(true);
		op.addArguments("start-Maximized");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(op);
		//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		driver.findElementById("password").sendKeys("crmsfa");
		//		Thread.sleep(2000);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_companyName").sendKeys("test");
		driver.findElementById("createLeadForm_firstName").sendKeys("Bharathwaj");
		driver.findElementById("createLeadForm_lastName").sendKeys("lastname");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select objSource=new Select(source);
		//		objSource.selectByIndex(4);
		//		objSource.selectByValue("LEAD_EMPLOYEE");
		objSource.selectByVisibleText("Employee");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select objMarket=new Select(market);
		objMarket.selectByVisibleText("Road and Track");
		/*List<WebElement> allOptions = objMarket.getOptions();
		for (WebElement eachOption : allOptions) {
			String optionName = eachOption.getText();
			System.out.println(optionName);
		}*/
		//		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("firstNameLocal");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("lastNameLocal");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("MR");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("title");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("30");
		WebElement elementIndustry = driver.findElementById("createLeadForm_industryEnumId");
		Select objIndustry=new Select(elementIndustry);
		objIndustry.selectByValue("IND_AEROSPACE");
		WebElement elementOwnership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select objOwnership=new Select(elementOwnership);
		objOwnership.selectByIndex(3);
		driver.findElementById("createLeadForm_sicCode").sendKeys("SIC Code");
		driver.findElementById("createLeadForm_description").sendKeys("Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Importatnt Note");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("123");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("456");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("91");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Department");
//		driver.findElementById("createLeadForm_currencyUomId").clear();
		WebElement elementCurrency = driver.findElementById("createLeadForm_currencyUomId");
		Select objCurrency=new Select(elementCurrency);
		objCurrency.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("456");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8148981817");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Person To Ask");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("Web URL");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sample@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("To Name");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snaps/img.png");
		FileUtils.copyFile(src, desc);
		WebElement elementFirstName = driver.findElementById("viewLead_firstName_sp");
		String firstName = elementFirstName.getText();
		if (firstName.equals("Bharathwaj"))
			System.out.println("Lead created successfully");
		else
			System.out.println("Lead not created");
		
		
		}

}
