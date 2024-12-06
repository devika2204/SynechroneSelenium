package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://jqueryui.com/button/");
		WebElement frame1 = driver1.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver1.switchTo().frame(frame1);
	driver1.switchTo().frame("demo_frame");
	WebElement btn = driver1.findElement(By.xpath("//iframe[@class='demo-frame']"));
	btn.click();
	
	

	}

}
