package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		WebElement submit=driver.findElement(By.name("firstname"));
		submit.sendKeys("Benita");

		WebElement submit2=driver.findElement(By.name("lastname"));
		submit2.sendKeys("Siva");

		WebElement submit3=driver.findElement(By.name("reg_email__"));
		submit3.sendKeys("benitasiva@gmail.com");

		WebElement submit4=driver.findElement(By.name("reg_email_confirmation__"));
		submit4.sendKeys("benitasiva@gmail.com");
		WebElement submit5=driver.findElement(By.name("reg_passwd__"));
		submit5.sendKeys("Welcome@24");
		WebElement drop1=driver.findElement(By.id("day"));
		drop1.sendKeys("19");
		
		WebElement drop2=driver.findElement(By.id("month"));
		Select obj=new Select(drop2);
		obj.selectByIndex(11);
		
		WebElement drop3=driver.findElement(By.id("year"));
		Select obj1=new Select(drop3);
		obj1.selectByValue("1993");
		
		WebElement radio=driver.findElement(By.name("sex"));
		radio.click();
		
		
		
		
		
		
}
}
