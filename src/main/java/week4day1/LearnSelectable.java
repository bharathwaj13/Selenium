package week4day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSelectable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		Actions builder=new Actions(driver);
		WebElement firstItem = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement secondItem = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement thirdItem = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement fourthItem = driver.findElementByXPath("//li[text()='Item 4']");
//		driver.getKeyboard().sendKeys(Keys.CONTROL);
		builder.keyDown(Keys.CONTROL).perform();
		builder.click(firstItem).perform();
		builder.click(fourthItem).perform();
//		driver.getKeyboard().releaseKey(Keys.CONTROL);
		builder.keyUp(Keys.CONTROL).perform();
	}

}
