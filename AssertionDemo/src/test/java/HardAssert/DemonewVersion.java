package HardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemonewVersion {
	
	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//div[@class='nav-search-field  ']")).sendKeys("Laptops");
		
		
	}

}
