package week3day1hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		Thread.sleep(2000);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		Thread.sleep(2000);
		boolean verifyCheckBox = driver.findElementById("chkSelectDateOnly").isSelected();
		if(verifyCheckBox)
			driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		WebElement tableTrain = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> totalRows = tableTrain.findElements(By.tagName("tr"));
		int rowCount=totalRows.size();
		System.out.println(rowCount);
		List<String> trainNames = new ArrayList<String>(rowCount);
//		System.out.println(driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody/tr[2]/td/a").getText());
		System.out.println("First List");
		for(int i=0;i<rowCount;i++)
		{
			System.out.println(driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody/tr["+i+"+1]/td/a").getText());
			trainNames.add(driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody/tr["+i+"+1]/td/a").getText());
		}
				//table[@class='DataTable TrainList']/tbody/tr[2]/td/a
		Collections.sort(trainNames);
		driver.findElementByXPath("//a[@title='Click here to sort on Train Number']").click();
		Thread.sleep(3000);
		List<String> sortedTrainNames = new ArrayList<String>(rowCount);
		System.out.println("Second List");
		for(int i=0;i<rowCount;i++)
		{
			System.out.println(driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody/tr["+i+"+1]/td/a").getText());
			sortedTrainNames.add(driver.findElementByXPath("//table[@class='DataTable TrainList']/tbody/tr["+i+"+1]/td/a").getText());
		}
		boolean flag=true;
		for(int i=0;i<rowCount;i++)
		{
			if(Integer.parseInt(trainNames.get(i))!=Integer.parseInt(sortedTrainNames.get(i)))
				flag=false;
			break;
		}
		if(flag)
			System.out.println("Both the Lists contain the same data in the same order");
		else
			System.out.println("Both the Lists do not contain the same data in the same order");
		
	}

}
