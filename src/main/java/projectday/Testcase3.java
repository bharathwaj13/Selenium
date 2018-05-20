package projectday;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		//select Samsung from TVs & Appliances
		
		WebElement tvApplianceLink = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		Actions builder=new Actions(driver);
		builder.moveToElement(tvApplianceLink).perform();
//		driver.findElementByXPath("//span[@class='TVs & Appliances']/a[@title='Samsung']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[text()='Samsung']/parent::a)[2]").click();
		
		//Filter min Price 25000
		
		WebElement minPrice = driver.findElementByXPath("//select[@class='a_eCSK']");
		Select selectOption=new Select(minPrice);
		selectOption.selectByValue("25000");
		Thread.sleep(2000);
		
		//Filter max Price 60000
		
		WebElement maxPrice = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");
		Select selectOption1=new Select(maxPrice);
		selectOption1.selectByValue("60000");
		
		//Click on Screensize filter
		
//		driver.findElementByXPath("(//div[@class='dRqIrL _2GQLOX'])[2]").click();
//		driver.findElementByXPath("//div[text()='Screen Size']").click();
		WebElement scrnsize = driver.findElementByXPath("//div[text()='Screen Size']");
		builder.moveToElement(scrnsize).perform();
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(scrnsize));
		builder.click(scrnsize).perform();
		Thread.sleep(3000);
		
		//Click 48-55
		
//		driver.findElementByXPath("//div[text()='48 - 55']/preceding-sibling::div").click();
		driver.findElementByXPath("//div[text()='48 - 55']").click();
		
		//Get the Price of the TV in the First Option
		
		String priceBeforeSelection = driver.findElementByXPath("//div[@class='_1uv9Cb']/div").getText();
		System.out.println(priceBeforeSelection);
		
		//click on first Option
		
		driver.findElementByXPath("//div[@class='col _2-gKeQ']").click();
		
		Thread.sleep(5000);
		
		//Switch to new Window
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Number of Windows: "+windowHandles.size());
		List<String> allWindowHandles=new ArrayList<String>();
		allWindowHandles.addAll(windowHandles);
		driver.switchTo().window(allWindowHandles.get(1));
		
		
		
		
		
		
	}

}
