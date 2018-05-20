package projectday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SimpleTestcase {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//To launch chrome WebDriver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//To handle Chrome Notification
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//To launch Facebook Site
		driver.get("https://www.facebook.com");

		//To login
		driver.findElementById("email").sendKeys("UserName");
		driver.findElementById("pass").sendKeys("Password");
		driver.findElementById("loginbutton").click();

		//To function Searchbox
		driver.getKeyboard().pressKey(Keys.ESCAPE);
		driver.findElementByName("q").sendKeys("Testleaf",Keys.ENTER);
		Thread.sleep(3000);

		//To click 'Like' button
		String attribute = driver.findElementByXPath("//div[text()='TestLeaf']/following::button").getAttribute("data-bt");

		////To check 'Like' button click
		if(attribute != null) 
		{
			driver.findElementByXPath("//button[text()='Like']").click();
		}

		//To click 'TestLeaf' link
		driver.findElementByLinkText("TestLeaf").click();

		//To click 'Reviews' link
		driver.findElementByLinkText("Reviews").click();

		//To print Total No.of Reviews
		String text = driver.findElementByXPath("//div[text()='90 reviews']").getText();
		System.out.println("No.of Reviews=" +text);
	}
}