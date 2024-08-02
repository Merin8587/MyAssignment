package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']/div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]")).click();
		 
		WebElement rdbtn=driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]"));
        System.out.println("Is Safari browser selected default?: "+rdbtn.isEnabled());

Boolean rdnsel = driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();

if (rdnsel==true) {
	System.out.println("Already selected the age group (21-40 Years)");
}else
{ 
	driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[6]")).click();
}

driver.close();
	}

}
