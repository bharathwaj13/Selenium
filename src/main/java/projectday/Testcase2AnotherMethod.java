package projectday;

import java.awt.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2AnotherMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses");
		driver.getKeyboard().sendKeys(Keys.ENTER);
		//finding the unique brand names
		Set<String> ProductNames=new LinkedHashSet<String>();
		java.util.List<WebElement> productLists = driver.findElementsByXPath("//div[@class='product-brand']");

		for (WebElement product : productLists) {
			ProductNames.add(product.getText());
		}
		System.out.println("The Unique Brands are: "+ProductNames);
		System.out.println("Number of unique brands are:" +ProductNames.size());
		//Getting the count of 40%
		//Set<String> discountSet=new LinkedHashSet<String>();

		/*List<WebElement> discountsList = driver.findElementsByXPath("(//span[@class='product-discountPercentage'])");
			int countOf40Percent=0;
			for (WebElement discount : discountsList) {
				if((discount.getText()).contains("40"))
				{
					countOf40Percent++;
				}
			}
			System.out.println("The Count of 40% off products: "+countOf40Percent);
			//finding the Unisex Count
			List<WebElement> uniSexList = driver.findElementsByXPath("//h4[@class='product-product']");
			int countOfUniSex=0;
			for (WebElement uniSex : uniSexList) {
				if((uniSex.getText()).contains("Unisex"))
				{
					countOfUniSex++;
				}
			}
			System.out.println("The Count of unique unisex products: "+countOfUniSex);*/
		//
		int count40OffUniSex=0;
		int count=0;
		java.util.List<WebElement> prodCol = driver.findElementsByClassName("product-productMetaInfo");
		int prodSize = prodCol.size();
		System.out.println(prodSize);
		//for (WebElement oneProd : prodCol) {
		for (int i=1;i<=prodSize;i++) {
			String prodName = driver.findElementByXPath("(//h4[@class='product-product'])["+i+"]").getText();//Product desc
			String prodOff = driver.findElementByXPath("(//span[@class='product-discountPercentage'])["+i+"]").getText();//Product Disc

			if (prodName.contains("Unisex")&&prodOff.contains("40%"))
			{
				count40OffUniSex++;
			}
			//count++;
		}
		System.out.println(count40OffUniSex);
		//clicking on the Green colour filter
		Thread.sleep(10000);
		driver.findElementByXPath("//li[@data-colorhex='green']/label").click();
		//Clicking on the second result
		driver.findElementByXPath("(//span[@class='product-discountedPrice'])[2]").click();
		//Printing the name of the selected item
		String prodName = driver.findElementByClassName("pdp-title").getText();
		System.out.println("The selected product name is: "+prodName);
		//clicking in add to bag
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		//clicking on go to bag
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();
		//Checking the Product and price from bag
		if((driver.findElementByXPath("//div[@class='prod-name']/a").getText()).equals(prodName)) {
			System.out.println("The Product name is verified");
		}

	}


}

