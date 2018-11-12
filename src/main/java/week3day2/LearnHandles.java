package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()=' CONTACT US ']").click();
		Thread.sleep(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		System.out.println(allWindowHandles);
		List<String> listWindowHandles=new ArrayList<String>();
		listWindowHandles.addAll(allWindowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		driver.switchTo().window(listWindowHandles.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
