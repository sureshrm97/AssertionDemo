package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assert1 {
	
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		System.out.println("Title of the Page:"+actualtitle);
		String expectedtiltle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualtitle, expectedtiltle);*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.manage().deleteAllCookies();
		String actualtitle=driver.getTitle();
		
		System.out.println("No of the Title:"+actualtitle);
		String expectedtitle="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualtitle, expectedtitle);
		

		
		driver.close();
	}
	}


