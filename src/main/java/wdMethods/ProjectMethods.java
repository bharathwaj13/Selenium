package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6day1.ReadFromExcel;

public class ProjectMethods extends SeMethods {
	public String excelFileName="";
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void login(String url,String username,String password,String browser) {
		startApp(browser, url);
		WebElement userName = locateElement("id","username");
		type(userName, username);
		WebElement passWord = locateElement("id", "password");
		type(passWord, password);
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);		
		WebElement crmsfa = locateElement("link","CRM/SFA");
		click(crmsfa);
	}
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	@DataProvider(name="fetchData",indices= {1})
	public Object[][] getData() throws IOException{
		ReadFromExcel readexcel=new ReadFromExcel();
		return readexcel.readExcel(excelFileName);
	}
}

