package Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicateLead {

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
driver.findElement(By.xpath("//span[text()='Email']")).click();
Thread.sleep(2000);
driver.findElement(By.name("emailAddress")).sendKeys("benitasivakumar@gmal.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String a = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
System.out.println(a);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Duplicate Lead")).click();

String b=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
System.out.println(b);
{
if(b.contains("Duplicate Lead"))
{
	System.out.println("verified");
	}}
Thread.sleep(2000);
driver.findElement(By.className("smallSubmit")).click();
Thread.sleep(2000);
String c=driver.findElement(By.id("viewLead_firstName_sp")).getText();
Thread.sleep(2000);
if(a.contentEquals(c))
{
	System.out.println("same");
}
driver.close();


}
}
