package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeWebDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://sreekanthsseleniumprogramming.blogspot.in/2015/07/action-class-mouse-over-actions.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
