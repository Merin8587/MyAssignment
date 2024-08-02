package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in/");

driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
driver.findElement(By.xpath("//div[text()='bags for boys']")).click();
 System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
 driver.findElement(By.xpath("//div[@id='brandsRefinements']//i")).click();
 driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
 
 driver.findElement(By.id("a-autoid-0-announce")).click();
 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
 System.out.println(driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText());
 System.out.println(driver.getTitle());
 driver.close();
 
	}

}
