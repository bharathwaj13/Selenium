package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
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
		driver.findElementById("createLeadForm_firstName").sendKeys("firstname");
		driver.findElementById("createLeadForm_lastName").sendKeys("lastname");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select objSource=new Select(source);
		//		objSource.selectByIndex(4);
		//		objSource.selectByValue("LEAD_EMPLOYEE");
		objSource.selectByVisibleText("Employee");
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select objMarket=new Select(market);
		List<WebElement> allOptions = objMarket.getOptions();
		for (WebElement eachOption : allOptions) {
			String optionName = eachOption.getText();
			System.out.println(optionName);
		}
		//		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
	}

}
