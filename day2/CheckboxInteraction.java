package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])")).click();
		 driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).isDisplayed();
		 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		 driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		 driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).isDisplayed();

		 
		WebElement verify = driver.findElement(By.xpath("//input[contains(@id,'j_idt87:j_idt102')]"));
		System.out.println(verify.isEnabled());
	
		 
		 WebElement multiple = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple')]"));
		 multiple.click();
		 
		 driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		 

		Thread.sleep(5000);

		
		driver.close();
		
	

	}

}
