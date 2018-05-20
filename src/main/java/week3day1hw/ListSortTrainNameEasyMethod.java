package week3day1hw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSortTrainNameEasyMethod {

	public static void main(String[] args) throws InterruptedException {
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
		for (WebElement eachRow : totalRows) {
			WebElement columnTrainName = eachRow.findElement(By.xpath("//td[2]"));
			trainNames.add(columnTrainName.getText());
		}

	}

}
