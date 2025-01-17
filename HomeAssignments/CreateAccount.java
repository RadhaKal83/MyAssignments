package week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.partialLinkText("Accounts")).click();
	driver.findElement(By.partialLinkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Radha");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("numberEmployees")).sendKeys("2");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
}
}
