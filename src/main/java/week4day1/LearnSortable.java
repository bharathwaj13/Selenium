package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		Actions builder=new Actions(driver);
		WebElement firstElement = driver.findElementByXPath("//ul[@class='ui-sortable']/li");
		int y = firstElement.getLocation().getY();
		
		WebElement thirdElement = driver.findElementByXPath("//ul[@class='ui-sortable']/li[3]");
		int thirdy = thirdElement.getLocation().getY();
//		builder.dragAndDrop(firstElement, thirdElement).perform();
		builder.dragAndDropBy(firstElement, 0, thirdy+10).perform();
		//builder.release(firstElement);
		
	}

}
