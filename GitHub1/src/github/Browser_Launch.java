package github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
		String a = driver.getCurrentUrl();
		System.out.println(a);
		//Thread.sleep(2000);
		//driver.close();

	}

}
