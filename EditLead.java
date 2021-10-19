package Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
driver.findElement(By.linkText("11173")).click();
String a=driver.getTitle();
System.out.println(a);
if(a.contains("View Lead"))
{
	System.out.println("Title verified");
}
driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='inputBox'][1]")).clear();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='inputBox'][1]")).sendKeys("Barclays");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
Thread.sleep(2000);
driver.close();

}

}
