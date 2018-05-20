package week2day2hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
		Thread.sleep(2000);
		driver.findElementByName("emailAddress").sendKeys("sample@gmail.com");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		String firstName = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(3000);
		String sectionHeader = driver.findElementByXPath("//div[@class='x-panel-header sectionHeaderTitle']").getText();
		if(sectionHeader.equalsIgnoreCase("Duplicate Lead"))
			System.out.println("Correct Section Header displays");
		else
			System.out.println("Wrong Section Header displays");
		driver.findElementByName("submitButton").click();
		Thread.sleep(4000);
		String duplicateLead = driver.findElementById("viewLead_firstName_sp").getText();
		if(duplicateLead.equals(firstName))
			System.out.println("Duplicate Name is same");
		else
			System.out.println("Duplicate Name is not same");
		
	}

}
