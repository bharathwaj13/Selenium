package projectday;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> brands=new LinkedHashSet<String>();
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);
	
		// Print all Unique Brand Names
		
		List<WebElement> allProducts = driver.findElementsByXPath("//div[@class='product-brand']");
		for (WebElement eachProduct : allProducts) {
			brands.add(eachProduct.getText());
		}
		System.out.println(brands);
		
		// Print Count of Sunglasses with 40% discount
		
		int counter=0;
		List<WebElement> allDiscountList = driver.findElementsByClassName("product-discountPercentage");
		for (WebElement eachDiscount : allDiscountList) {
			if(eachDiscount.getText().contains("40%"))
				counter++;
		}
		System.out.println("Number of Sunglasses with 40% discount is: "+counter);
		
		// Print Count of Unisex Sunglasses with 40% discount
		
		List<WebElement> allsunglassProducts = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");
		List<WebElement> discountedList=new ArrayList<WebElement>();
		for (WebElement eachDiscount : allsunglassProducts) {
			if(eachDiscount.getText().contains("(40% OFF)")&& eachDiscount.getText().contains("Unisex"))
				discountedList.add(eachDiscount);
		}
		System.out.println("Number of Unisex Products with 40% discount is "+discountedList.size());
		
		// Filter Green Colour
		
		driver.findElementByXPath("//li[@data-colorhex='green']/label").click();
		driver.findElementByXPath("//ul[@class='results-base']/li[2]").click();
		
		//Print Sunglass Name
		
		String sunglassName = driver.findElementByXPath("//h1[@class='pdp-title']").getText();
		System.out.println(sunglassName);
		
		// Print Sunglass Price
		
		String price = driver.findElementByXPath("//strong[@class='pdp-price']").getText();
		System.out.println(price);
		
		
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();
		Thread.sleep(3000);
		String nameInBag=driver.findElementByXPath("//div[@class='prod-name']/a").getText();
		String costInBag = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();
		costInBag = costInBag.replaceAll(",", "");
		System.out.println("Name in Bag: "+nameInBag);
		System.out.println("Cost in Bag: "+costInBag);
		if(nameInBag.contains(sunglassName)&& costInBag.contains(price))
			System.out.println("Both the Price and name are correct");
		else
			System.out.println("The price and name are not correct");
	}

}
