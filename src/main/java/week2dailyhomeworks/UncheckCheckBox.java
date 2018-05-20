package week2dailyhomeworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement confirmCheckBox = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input");
		boolean verify = confirmCheckBox.isSelected();
		if(verify)
			confirmCheckBox.click();
	}

}
