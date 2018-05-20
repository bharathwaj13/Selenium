package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		driver.findElementById("createLeadForm_birthDate-button").click();
		Thread.sleep(2000);
		WebElement elementTable = driver.findElementByXPath("//div[@class='calendar']/table");
		List<WebElement> tableRows = elementTable.findElements(By.tagName("tr"));
		int sizeRows = tableRows.size();
		System.out.println(sizeRows);
		WebElement firstRow = tableRows.get(3);
		List<WebElement> tableColumns = firstRow.findElements(By.tagName("td"));
		System.out.println(tableColumns.size());
		tableColumns.get(1).click();
	}

}
