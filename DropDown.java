package week2.HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		driver.findElement(By.id("accountName")).sendKeys("Karshini");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryDd = driver.findElement(By.name("industryEnumId"));
		Select ind=new Select (industryDd);
		ind.selectByValue("IND_SOFTWARE");
		WebElement ownershipDd = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(ownershipDd);
		own.selectByVisibleText("S-Corporation");
		WebElement sourceDd = driver.findElement(By.id("dataSourceId"));
		Select sour = new Select(sourceDd);
		sour.selectByIndex(4);
		WebElement markDd = driver.findElement(By.id("marketingCampaignId"));
		Select mark = new Select(markDd);
		mark.selectByIndex(6);
		WebElement stateDd = driver.findElement(By.id("generalStateProvinceGeoId"));		
		Select state = new Select(stateDd);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
				
		

	}

}
