package projectday;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComplexTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Actions builder=new Actions(driver);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		//Identificaiton of the web element -> Electronics tab
		WebElement electronics = driver.findElementByXPath("//li[@class='Wbt_B2'][2]");
		builder.click(electronics).perform();

		//Identification of the samsung items in the list
		driver.findElementByXPath("(//li[@class='_1KCOnI']/a[@class='_3ZgIXy']/span[text()='Samsung'])[2]").click();
		WebElement minPriceValues = driver.findElementByXPath("//div[@class='_2yCtb1']//select");
		Select selectByMoney=new Select(minPriceValues);
		selectByMoney.selectByIndex(3);

		WebElement maxPrice = driver.findElementByXPath("//div[@class='_3nSxeA']/select[@class='a_eCSK']");
		Select maxPriceList=new Select(maxPrice);
		maxPriceList.selectByIndex(3);

		//Click on the screen size and select it as 48-55 checkbox

		WebElement scrnsize = driver.findElementByXPath("//div[text()='Screen Size']");
		builder.moveToElement(scrnsize).perform();
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(scrnsize));
		builder.click(scrnsize).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='48 - 55']").click();

		//Get the price of the first result screen
		WebElement searchResultPriceElement = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String priceResultScreen = searchResultPriceElement.getText();
		System.out.println(priceResultScreen);

		//Clicking on the first result
		driver.findElementByXPath("(//div[@class='_3T_wwx']//a)[1]").click();

		//Navigating to the second window
		String parentWindow = driver.getWindowHandle();
		Set<String> setWindowHandles = driver.getWindowHandles();
		List<String> listWindowHandles= new ArrayList<String>();
		listWindowHandles.addAll(setWindowHandles);
		String currentWindow = listWindowHandles.get(1);
		driver.switchTo().window(currentWindow);

		//Get the price values from the secondWindow
		String priceViewScreen = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']").getText();
		System.out.println(priceViewScreen);
		
		//Compare the price values between the two screens
		if(priceResultScreen.equals(priceViewScreen)) {
			System.out.println("The values are matching");
		}
		
		//closing the current window		
		driver.close();
		
		//Switching the the parent window
		
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		driver.findElementByXPath("(//span[@class='_1nUZxV']//label/input[@class='_3uUUD5'])[1]").click();
		
		driver.findElementByXPath("(//span[@class='_1nUZxV']//label/input[@class='_3uUUD5'])[2]").click();
		



	}







}