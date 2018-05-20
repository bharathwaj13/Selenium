package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if(browser.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.safari.driver", "./drivers/safaridriver.exe");
				driver = new SafariDriver();
			}
			else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Pass The Browser is Launched");
		} catch (WebDriverException e) {
			System.err.println("Safari browser can be opened only in MAC browser");
			//			e.printStackTrace();
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);		
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			default:
				break;
			}

		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator "+locator+" cannot be found using "+locValue);
			//			e.printStackTrace();
		}

		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Pass The Value is Entered");
		} catch (InvalidElementStateException e) {
			System.err.println("Cannot enter the value "+data+" in the Element "+ele);
			//			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.err.println("Null value in WebElement Identification");
			//			e.printStackTrace();
		}
		finally {
			takeSnap();			
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("Pass The Element Is Clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//			e.printStackTrace();
			System.err.println("The Element "+ele+" cannot be clicked");
		}
		finally {
			takeSnap();			
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("Pass The Element "+ele+" Is Clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//			e.printStackTrace();
			System.err.println("The Element "+ele+" cannot be clicked");
		}

	}

	public String getText(WebElement ele) {
		try {
			return ele.getText();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//			e.printStackTrace();
			System.err.println("Cannot find the Element "+ele);
		}
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select selectValue=new Select(ele);
			selectValue.selectByVisibleText(value);
			System.out.println("Pass Selected the Dropdown "+ele+" with Text "+value);
		} catch (NoSuchElementException e) {
			System.err.println("Value "+value+" not present in dropdown "+ele);
			//			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select selectValue=new Select(ele);
			selectValue.selectByIndex(index);
			System.out.println("Pass Selected the Dropdown "+ele+" with Index "+index);
		} catch (NoSuchElementException e) {
			//			e.printStackTrace();
			System.err.println("Index "+index+" not present in dropdown "+ele);
		}
		finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		try {
			Select selectValue=new Select(ele);
			selectValue.selectByValue(value);
			System.out.println("Pass Selected the Dropdown "+ele);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Value "+value+" not present in dropdown "+ele);
		}
		finally {
			takeSnap();			
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String pageTitle = driver.getTitle();
			return pageTitle.equalsIgnoreCase(expectedTitle);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("The Browser no longer exists");
			throw new RuntimeException();
		}
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			String textValue = getText(ele);
			if(textValue.equalsIgnoreCase(expectedText))
				System.out.println("Pass Correct text "+expectedText+" present in the element "+ele);
			else
				System.out.println("Fail Correct text "+expectedText+" not present in the element "+ele);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("No Element present as "+ele);
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String textValue = getText(ele);
			if(textValue.contains(expectedText))
				System.out.println("Pass Partial text "+expectedText+" present in the element "+ele);
			else
				System.out.println("Fail Partial text "+expectedText+" not present in the element "+ele);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("No Element present as "+ele);
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String attributeValue = ele.getAttribute(attribute);
			if(attributeValue.equalsIgnoreCase(value))
				System.out.println("Pass "+attribute+" Attribute value of Element "+ele+" is "+value);
			else
				System.out.println("Fail "+attribute+" Attribute value of Element "+ele+" is not "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Element as "+ele);
		}
		catch (NullPointerException e) {
			System.err.println("No such Attribute as "+attribute+" in Element "+ele);
		}
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String attributeValue = ele.getAttribute(attribute);
			if(attributeValue.contains(value))
				System.out.println("Pass Partial match of Attribute value "+value+" is true");
			else
				System.out.println("Fail Partial match of Attribute value "+value+" is false");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Element as "+ele);
		}
		catch (NullPointerException e) {
			System.err.println("No such Attribute as "+attribute+" in Element "+ele);
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if (ele.isSelected())
				System.out.println("Pass The element "+ele+" is Selected");
			else
				System.out.println("Fail The element "+ele+" is not Selected");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Element as "+ele);
		}
		finally {
			takeSnap();			
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if (ele.isDisplayed())
				System.out.println("Pass The element "+ele+" is displayed");
			else
				System.out.println("Fail The element "+ele+" is not displayed");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Element as "+ele);
		}
		finally {
			takeSnap();			
		}
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			System.out.println("No. of windows "+allWindowHandles.size());
			List<String> listwindowHandles=new ArrayList<String>();
			listwindowHandles.addAll(allWindowHandles);
			System.out.println("No. of windows "+listwindowHandles.size());
			driver.switchTo().window(listwindowHandles.get(index));
			System.out.println("Pass Switched to Window No. "+index);
			takeSnap();
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no Window with Index "+index);
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Pass Switched to Frame "+ele);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Element as "+ele);
		}
	}

	public void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
			System.out.println("Pass Switched to Frame "+index);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no Frame with index "+index);
		}
	}

	public void switchToFrame(String name) {
		try {
			driver.switchTo().frame(name);
			System.out.println("Pass Switched to Frame "+name);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no frame with name "+name);
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Pass Accepted the Alert");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no Alert present");
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Pass Dismissed the Alert");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no Alert present");
		}
	}

	public String getAlertText() {
		try {
			return driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no Alert present");
		}
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Pass Closed the current Active Browser");
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No Broswer exists");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("Pass Closed all the Browsers");
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No Broswer exists");
		}
	}

	public void clearText(WebElement ele) {
		try {
			ele.clear();
			System.out.println("Pass Cleared text in element "+ele);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("There is no such element as "+ele);
		}
	}

	public void getActiveURL() {
		try {
			System.out.println(driver.getCurrentUrl());
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No Browser exists");
		}
	}

	public void focusWindow() {
		((JavascriptExecutor) driver).executeScript("window.focus();");
	}

	public String getwindowHandle() {
		return driver.getWindowHandle();
	}

	public void switchToWindow(String name) {
		try {
			driver.switchTo().window(name);
			System.out.println("Pass Switched to the required window");
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("No such Window exists");
		}
	}

}
