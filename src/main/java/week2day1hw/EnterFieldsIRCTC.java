package week2day1hw;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterFieldsIRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementByLinkText("Sign up").click();
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:userName").sendKeys("bharath");
		driver.findElementById("userRegistrationForm:password").sendKeys("IRCTCPassword");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("IRCTCPassword");
		WebElement securityQuestion = driver.findElementById("userRegistrationForm:securityQ");
		Select objSecurityQuestion=new Select(securityQuestion);
		List<WebElement> optionsListSecurity = objSecurityQuestion.getOptions();
		int sizeSecurityList = optionsListSecurity.size();
		objSecurityQuestion.selectByIndex(sizeSecurityList-2);
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Maruti Suzuki");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Bharath");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Bharath");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Bharath");
		driver.findElementById("userRegistrationForm:gender:0").click();
		Thread.sleep(2000);
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		Thread.sleep(2000);
		WebElement elementDate = driver.findElementById("userRegistrationForm:dobDay");
		Select objDate=new Select(elementDate);
		objDate.selectByValue("13");
		Thread.sleep(2000);
		WebElement elementMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select objMonth=new Select(elementMonth);
		objMonth.selectByVisibleText("MAR");
		Thread.sleep(2000);
		WebElement elementYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select objYear=new Select(elementYear);
		objYear.selectByIndex(10);
		Thread.sleep(2000);
		WebElement elementOccupation = driver.findElementById("userRegistrationForm:occupation");
		Select objOccupation=new Select(elementOccupation);
		objOccupation.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789");
		driver.findElementById("userRegistrationForm:idno").sendKeys("123456789");
		WebElement elementCountry = driver.findElementById("userRegistrationForm:countries");
		Select objCountry=new Select(elementCountry);
		objCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.findElementById("userRegistrationForm:email").sendKeys("bharathwaj13@gmail.com");
//		driver.findElementById("userRegistrationForm:isdCode").sendKeys("91");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8148981817");
		WebElement elementNationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select objNationality=new Select(elementNationality);
		objNationality.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("22");
		driver.findElementById("userRegistrationForm:street").sendKeys("Srinivasa Nagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("Chitlapakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600064",Keys.TAB);
		Thread.sleep(3000);
		WebElement elementCity = driver.findElementById("userRegistrationForm:cityName");
		Select objCity=new Select(elementCity);
		objCity.selectByVisibleText("Kanchipuram");
		Thread.sleep(3000);
		WebElement elementPostOffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select objPostOffice=new Select(elementPostOffice);
		objPostOffice.selectByValue("Chitlapakkam S.O");
		Thread.sleep(3000);
		driver.findElementById("userRegistrationForm:landline").sendKeys("22231325");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		
		
	}

}
