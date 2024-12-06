package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filedownloader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/download");
		Thread.sleep(2000);
		WebElement download = driver.findElement(By.xpath("/a[contains(text(),'1000_F_561609331_cmOdHBvlRGhWqPZuB1QBLLlc6nQ1m1eq.')]\r\n");
			

	}

}
