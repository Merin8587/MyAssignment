package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345567890");
		
//		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
//    	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Merin");
//		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("George");
//		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Accenture");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String id =leadID.getText();
		System.out.println(id);
		
		driver.findElement(By.xpath("//a[text()='Merin']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement msg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(msg.isDisplayed());
		System.out.println(msg.getText());
		
		driver.close();
		
		
		
		

	}

}
