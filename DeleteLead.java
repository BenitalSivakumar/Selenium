package Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
	WebElement ele=driver.findElement(By.id("username"));
	ele.sendKeys("DemosalesManager");
	WebElement ele1=driver.findElement(By.id("password"));
	ele1.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("9573737361");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String a=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		System.out.println(a);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(3000);
			driver.findElement(By.className("subMenuButtonDangerous")).click();
			
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(a); 
		driver.findElement(By.linkText("Find Leads")).click();
		driver.close();
}}
