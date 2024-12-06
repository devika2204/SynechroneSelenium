package Testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moveto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://practicetestautomation.com/");
		WebElement username = driver1.findElement(By.xpath(//label[normalize-space()='Username'])); 

	}

}
