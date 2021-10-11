package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadDay3 {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
WebElement ele=driver.findElement(By.id("username"));
ele.sendKeys("DemosalesManager");
WebElement ele1=driver.findElement(By.id("password"));
ele1.sendKeys("crmsfa");

WebElement submit=driver.findElement(By.className("decorativeSubmit"));
submit.click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
WebElement text1=driver.findElement(By.id("createLeadForm_companyName"));
text1.sendKeys("Testleaf");
WebElement text2=driver.findElement(By.id("createLeadForm_firstName"));
text2.sendKeys("Benital");
WebElement text3=driver.findElement(By.id("createLeadForm_lastName"));
text3.sendKeys("Sivakumar");
WebElement text4=driver.findElement(By.id("createLeadForm_firstNameLocal"));
text4.sendKeys("Beni");
WebElement text5=driver.findElement(By.id("createLeadForm_lastNameLocal"));
text5.sendKeys("s");
WebElement text6=driver.findElement(By.id("createLeadForm_personalTitle"));
text6.sendKeys("Mrs");
WebElement text7=driver.findElement(By.id("createLeadForm_birthDate"));
text7.sendKeys("12/28/1993");
WebElement text8=driver.findElement(By.id("createLeadForm_generalProfTitle"));
text8.sendKeys("Mrs");
WebElement text9=driver.findElement(By.id("createLeadForm_departmentName"));
text9.sendKeys("Automation testing");
WebElement text10=driver.findElement(By.id("createLeadForm_annualRevenue"));
text10.sendKeys("1000000");
WebElement text11=driver.findElement(By.id("createLeadForm_numberEmployees"));
text11.sendKeys("1000");
WebElement text12=driver.findElement(By.id("createLeadForm_sicCode"));
text12.sendKeys("12345678");
WebElement text13=driver.findElement(By.id("createLeadForm_tickerSymbol"));
text13.sendKeys("yes");
WebElement text14=driver.findElement(By.id("createLeadForm_description"));
text14.sendKeys("NA");
WebElement text15=driver.findElement(By.id("createLeadForm_importantNote"));
text15.sendKeys("Good work");
WebElement text16=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
text16.sendKeys("91");
WebElement text17=driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
text17.sendKeys("91");
WebElement text18=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
text18.sendKeys("9003948523");
WebElement text19=driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
text19.sendKeys("122");
WebElement text20=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
text20.sendKeys("Beni");
WebElement text21=driver.findElement(By.id("createLeadForm_primaryEmail"));
text21.sendKeys("benitasivakumar@gmal.com");
WebElement text22=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
text22.sendKeys("www.google.com");
WebElement text23=driver.findElement(By.id("createLeadForm_generalToName"));
text23.sendKeys("Benita");
WebElement text24=driver.findElement(By.id("createLeadForm_generalAttnName"));
text24.sendKeys("Benita Sivakumar");
WebElement text25=driver.findElement(By.id("createLeadForm_generalAddress1"));
text25.sendKeys("chennai");
WebElement text26=driver.findElement(By.id("createLeadForm_generalAddress2"));
text26.sendKeys("tamil nadu");
WebElement text27=driver.findElement(By.id("createLeadForm_generalCity"));
text27.sendKeys("Chennai");
WebElement text28=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
text28.sendKeys("tamil nadu");
WebElement text29=driver.findElement(By.id("createLeadForm_generalPostalCode"));
text29.sendKeys("6000122");
WebElement text30=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
text30.sendKeys("600");
String text = driver.findElement(By.id("createLeadForm_firstName")).getText();
System.out.println(text);
WebElement submit2=driver.findElement(By.className("smallSubmit"));
submit2.click();







































}
}
