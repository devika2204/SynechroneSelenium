package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		WebElement test = driver1.findElement(By.xpath("//a[normalize-space()='Practice Test Automation.']"));
		Actions act = new Actions(driver1);
		act.scrollToElement(test).perform();
		Thread.sleep(2000);
		test.click();
		

	}

}
