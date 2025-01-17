package week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TechSoft");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Radha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalidass");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Radha");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Kalidass");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Developer");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("working as a software developer");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("radhakalidass@gmail.com");
        WebElement stateDd = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateDd);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("hello from testleaf");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is :" + driver.getTitle());
		driver.close();
	}

}
