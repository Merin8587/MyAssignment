package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.xpath("//div[@id='label']/a")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  driver.findElement(By.xpath("//input[@id ='createLeadForm_firstName']")).sendKeys("Merin");
		  driver.findElement(By.xpath("//input[@id ='createLeadForm_lastName']")).sendKeys("George");
		  driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("Accenture");
		  
		  driver.findElement(By.xpath("//input[contains(@id,'generalProfTitle')]")).sendKeys("Selenium HomeAssignment");
		  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		  
		  String title =driver.getTitle();
		 System.out.println(title);
		  
		  if(title.contains("Lead"))
		  {
			  System.out.println("Title displayed");
			  }else
			  {
			  System.out.println("Title not displayed");
		  }
		  
driver.close();
	}

}
