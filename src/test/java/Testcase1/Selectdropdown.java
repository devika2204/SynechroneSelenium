package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver1.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		sel.selectByValue("option2");
		// TODO Auto-generated method stub

	}

}
