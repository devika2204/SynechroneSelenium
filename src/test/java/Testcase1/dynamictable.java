package Testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) throws y {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://ui.cogmento.com/");
		driver1.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("devika2242@gmail.com");
		driver1.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Devika@22");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

	}

}
