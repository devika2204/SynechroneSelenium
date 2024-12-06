package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		WebElement Practice = driver1.findElement(By.xpath("//a[normalize-space()='Practice']"));
		Actions act = new Actions (driver1);
		act.doubleClick(Practice);
		driver1.navigate().back();
		WebElement Courses = driver1.findElement(By.xpath("//a[normalize-space()='Courses']"));
		Thread.sleep(2000);
		act.contextClick().perform();
		
	//	WebElement mobiles = driver.findElement(By.xpath("))

	}

}
