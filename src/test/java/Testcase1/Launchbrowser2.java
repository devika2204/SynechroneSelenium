package Testcase1;



	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
	public class Launchbrowser2 {

public static void main(String[] args) {
				// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");

				
			
}
}
