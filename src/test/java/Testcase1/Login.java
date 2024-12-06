package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://practicetestautomation.com/practice-test-login/");
//		System.out.println(driver1.getTitle());
//		System.out.println(driver1.getCurrentUrl());
//		System.out.println(driver1.getPageSource());
		WebElement username = driver1.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("student");
		WebElement pwd = driver1.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("Password123");
		WebElement login = driver1.findElement(By.xpath("//input[@id='submit']"));
		login.click();
		
		

	}

}
