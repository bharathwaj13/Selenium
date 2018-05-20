package week3day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Bharath");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String enteredText = driver.findElementByXPath("//p[@id='demo']").getText();
		if(enteredText.contains("Bharath"))
			System.out.println("Entered text displayed correctly");
		else
			System.out.println("Entered text displayed incorrectly");
	}

}
