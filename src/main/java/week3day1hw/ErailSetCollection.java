package week3day1hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSetCollection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		ArrayList<String> trainNames = new ArrayList<String>();
		ArrayList<String> sortedTrainNames=new ArrayList<String>();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);

		if (driver.findElementById("chkSelectDateOnly").isSelected()) {
			driver.findElementById("chkSelectDateOnly").click();
		}
		WebElement trainTable = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> tRow = trainTable.findElements(By.tagName("tr"));
		int rowSize = tRow.size();
		//System.out.println(rowSize);
		for (WebElement eachRow : tRow) {
			List<WebElement> td1 = eachRow.findElements(By.tagName("td"));
			String trainName = td1.get(1).getText();
			trainNames.add(trainName);
		}
	
		System.out.println(trainNames);
		Collections.sort(trainNames);
		//System.out.println(trainNames);
		//Sorting the train names by clicking it
	driver.findElementByXPath("//a[text()='Train Name']").click();
	//storing the sorted train name
	for (WebElement eachRow : tRow) {
		List<WebElement> td1 = eachRow.findElements(By.tagName("td"));
		String sortedTrainName = td1.get(1).getText();
		sortedTrainNames.add(sortedTrainName);
	}
	if (trainNames.contains("sortedTrainNames"))
		System.out.println("The train names are sorted");
	else
		System.out.println("The train names are not sorted	");
	}
	

}
