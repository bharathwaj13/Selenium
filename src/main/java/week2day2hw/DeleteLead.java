package week2day2hw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
		Thread.sleep(2000);
//		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("91");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("8148981817");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		WebElement elementLeadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String leadID = elementLeadID.getText();
		System.out.println(leadID);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(3000);
		driver.findElementByClassName("subMenuButtonDangerous").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-form-element']/input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		if (driver.findElementByXPath("//div[text()='No records to display']").isDisplayed())
			System.out.println("Deleted Record is not displayed");
		else
			System.out.println("Record not Deleted");
		
		
		
	}

}
