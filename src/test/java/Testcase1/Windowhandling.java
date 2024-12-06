package Testcase1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.navigate().to("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		String parentwindow = driver1.getWindowHandle();
		System.out.println(parentwindow);;
		WebElement clickhere = driver1.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		clickhere.click();
		Set<String> allwindows = driver1.getWindowHandles();
		System.out.println(allwindows);
		Iterator<String> itr =allwindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parentwindow.equals(childwindow)){
				driver1.switchTo().window(childwindow);
				String text = driver1.findElement(By.xpath("/html/body/div/h3")).getText();
				System.out.println(text);
				
				
			}
			
		}

	}

}
