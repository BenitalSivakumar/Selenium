package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
WebElement ele=driver.findElement(By.id("username"));
ele.sendKeys("DemosalesManager");
WebElement ele1=driver.findElement(By.id("password"));
ele1.sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Benita");
driver.findElement(By.id("lastNameField")).sendKeys("Siva");
driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Benita");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Siva");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
driver.findElement(By.id("createContactForm_description")).sendKeys("NA");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("benitasiva@gmail.com");

WebElement dro4=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select obj4=new Select (dro4);
obj4.selectByVisibleText("Alabama");


driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateContactForm_description")).clear();

driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("NA");


driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

System.out.println("the Title is"+driver.getTitle());







}
}
