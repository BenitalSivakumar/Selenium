package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAssignment {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		WebElement ele1=driver.findElement(By.name("UserFirstName"));
		ele1.sendKeys("Beni");
		
		WebElement ele2=driver.findElement(By.name("UserLastName"));
		ele2.sendKeys("Siva");
		WebElement ele3=driver.findElement(By.name("UserEmail"));
		ele3.sendKeys("Benitasiva@gmail.com");
		WebElement ele4=driver.findElement(By.name("UserTitle"));
		Select obj=new Select (ele4);
		obj.selectByValue("Student / Personal Interest");
		
		
		WebElement ele5=driver.findElement(By.name("CompanyName"));
		ele5.sendKeys("SivaGroup");
		
		WebElement ele6=driver.findElement(By.name("CompanyEmployees"));
		Select obj1=new Select (ele6);
		obj1.selectByValue("250");

		WebElement ele7=driver.findElement(By.name("UserPhone"));
		ele7.sendKeys("9003945689");
		
		
		WebElement ele8=driver.findElement(By.name("CompanyCountry"));
		Select obj2=new Select (ele8);
		obj2.selectByValue("US");
		WebElement ele9 = driver.findElement(By.name("CompanyState"));
		Select obj3=new Select (ele9);
		obj3.selectByValue("AL");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
       
		driver.close();
      
		
}
}
