package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable -notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();
		driver.findElement(By.xpath("(//div[@class='cities-names'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[3]")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='BUDDY']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
		driver.findElement(By.xpath("//button[contains(@class,'p-button p-component')]/span[text()='Book']")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//div[@class='seat-flow-custom-scroll']/tr[7]/td[8]")).click();
		WebElement seatinfo =driver.findElement(By.xpath("//div[@class='seat-info']"));
		System.out.println(seatinfo.getText());
		
		String amnt = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println(amnt);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		String amnt2 =driver.findElement(By.xpath("(//div[@class='grand-tota col-md-3']/h6/span)")).getText();
		System.out.println(amnt2);
		
		if(amnt!=amnt2)
		{
			System.out.println("Amount mismatch");
		}else
		{
			System.out.println("Amounts are same");
		}
		System.out.println(driver.getTitle());
		driver.close();
		}

	}

