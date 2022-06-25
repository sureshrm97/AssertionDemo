package HeadLess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessdemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--Headless");
		option.setHeadless(true);
		WebDriver driver =new ChromeDriver(option);
		
			driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
			
	}

}
