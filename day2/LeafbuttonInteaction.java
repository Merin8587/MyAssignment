package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafbuttonInteaction {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		
driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']")).click();

String title =driver.getTitle();

if (title.contains("Dashboard")) {
	System.out.println("Title of the page is Dashboard");
}else
{
	System.out.println("Title is not dashboard");
}

driver.navigate().back();

System.out.println(driver.findElement(By.name("j_idt88:j_idt92")).isEnabled());
WebElement buttonposition =driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']"));
System.out.println("Position of the button with the text ‘Submit.’ " +buttonposition.getLocation());

WebElement color = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']"));
System.out.println("Find the Save button color." + color.getCssValue("background-color"));

WebElement size =driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']"));
System.out.println("Find the height and width of this button. " +size.getSize());
	
	driver.close();
	}

}
