package week2dailyhomeworks;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSelectCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int index=0;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement elementCountry = driver.findElementById("userRegistrationForm:countries");
		Select objCountry=new Select(elementCountry);
		List<WebElement> allOptions = objCountry.getOptions();
		System.out.println(allOptions.size());
		for (WebElement eachOption : allOptions) {
			if(eachOption.getText().startsWith("E"))
			{
				counter++;
				if(counter==2)
					break;
			}
			index++;
		}
		objCountry.selectByIndex(index);

	}

}
