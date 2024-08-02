package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		 
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Accenture");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Merin");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("George");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("merin");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meringeorge8587@gmail.com");
WebElement drpdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options =new Select(drpdown);
		options.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note");
driver.findElement(By.xpath("//input[@value='Update']")).click();
System.out.println(driver.getTitle());
driver.close();
	}

}
