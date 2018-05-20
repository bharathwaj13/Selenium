package week2dailyhomeworks;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement elementCountry = driver.findElementById("userRegistrationForm:countries");
		Select objCountry=new Select(elementCountry);
		List<WebElement> allOptions = objCountry.getOptions();
		System.out.println(allOptions.size());
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}
	}

}
