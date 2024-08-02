package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialxpath {

	public static void main(String[] args) {
	
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com"); //basic Xpath -Attribute based
		driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("testleaf@2024"); // basic Xpath - partial match
		driver.findElement(By.xpath("(//input[contains(@class,'r4 wide')])[3]")).click(); //basic Xpath - collection based
		

	}

}
