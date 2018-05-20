package week2day2hw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
//		driver.findElementByXPath("//li[@id='ext-gen247__ext-gen287']/a[2]").click();
		/*driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("sample@gmail.com");*/
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Bharathwaj");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		/*WebElement elementTable = driver.findElementByClassName("x-grid3-body");
		List<WebElement> totalRows = elementTable.findElements(By.tagName("tr"));
		int rowCount = totalRows.size();
		System.out.println(rowCount);
		WebElement secondRow=totalRows.get(1);
		List<WebElement> totalColumns = secondRow.findElements(By.tagName("td"));
		totalColumns.get(2).click();*/
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//a").click();
		String pageTitle = driver.findElementByXPath("//div[text()='View Lead']").getText();
		if (pageTitle.equalsIgnoreCase("View Lead"))
			System.out.println("Correct Page Title displays");
		else
			System.out.println("Correct Page Title does not display");
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(2000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByName("submitButton").click();
		WebElement elementCompany = driver.findElementById("viewLead_companyName_sp");
		String companyName=elementCompany.getText();
		if(companyName.contains("TCS"))
			System.out.println("Correct Value Updated");
		else
			System.out.println("Correct value not updated");
				
		
		

	}

}
