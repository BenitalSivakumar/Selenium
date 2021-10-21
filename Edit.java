package Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
public static void main(String[] args) throws InterruptedException {
	
		 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leafground.com/pages/Edit.html");
	 
	 driver.findElement(By.id("email")).sendKeys("benitasiva@gmail.com");
	 driver.findElement(By.xpath("//input[@value='Append ']")).clear();
	 driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("values to send");
	 driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
	 Thread.sleep(2000);
	 String a = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		System.out.println(a);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	 boolean element= driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if (element==true) {
			System.out.println("the field is enabled");
			
		}
		else {
			System.out.println("the field is disabled");
		}
			
	 
}
}
