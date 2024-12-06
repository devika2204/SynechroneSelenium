package Testcase1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verticalscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://practicetestautomation.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)", "");
		

	}

}
