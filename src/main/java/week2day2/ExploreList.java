package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> listAllButtons = driver.findElementsByTagName("a");
		int noOfButtons = listAllButtons.size();
		System.out.println(noOfButtons);
		/*for (WebElement eachButton : listAllButtons) {
			System.out.println(eachButton.getText());
		}*/
		listAllButtons.get(noOfButtons-1).click();
	}

}
