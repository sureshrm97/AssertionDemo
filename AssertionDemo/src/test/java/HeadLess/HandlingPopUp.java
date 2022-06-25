package HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--start-maximized");
		opt.addArguments("---disable notifications");
		WebDriver suresh=WebDriverManager.chromedriver().capabilities(opt).create();
		
		suresh.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		
	}

}
