package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucelab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://www.saucedemo.com/v1/");
		driver1.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver1.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver1.findElement(By.xpath("(//*[name()='path'][@fill='currentColor'])[1]")).click();
		driver1.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver1.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Devika");
		driver1.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("R");
		driver1.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("560056");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		driver1.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();


	}

}
