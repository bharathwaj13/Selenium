package projectday;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MediumTestcaseSE extends SeMethods {
	@Test
	public void Run() {
		startApp("chrome", "https://www.myntra.com/");
		WebElement searchBar = locateElement("class", "desktop-searchBar");
		
	}

}
