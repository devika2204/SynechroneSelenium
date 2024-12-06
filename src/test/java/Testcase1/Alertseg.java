package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertseg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
		//WebElement Alert = driver1.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		WebElement promptAlert = driver1.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		promptAlert.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alt = driver1.switchTo().alert();
		alt.sendKeys("hi");
		
		alt.accept();
		// TODO Auto-generated method stub

	}

}
