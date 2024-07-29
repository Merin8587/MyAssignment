package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Merin");
		driver.findElement(By.name("lastname")).sendKeys("George");
		driver.findElement(By.name("reg_email__")).sendKeys("meringeorge8587@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("12345");
		
		WebElement day =driver.findElement(By.name("birthday_day"));
		     Select option1 =new Select(day);
		     option1.selectByValue("7");
	
		WebElement month =driver.findElement(By.name("birthday_month"));
		     Select option2 =new Select(month);
		     option2.selectByVisibleText("Feb");
		     
		WebElement year =driver.findElement(By.name("birthday_year"));
		     Select option3 =new Select(year);
		     option3.selectByValue("2018");
		     
		 driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input)")).click();
		
driver.close();
	}

}
