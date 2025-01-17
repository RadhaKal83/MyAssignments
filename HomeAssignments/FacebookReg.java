package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Radha");
		driver.findElement(By.name("lastname")).sendKeys("Kalidass");
		driver.findElement(By.name("reg_email__")).sendKeys("radhakalidass@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("radha");
		WebElement BdayDd = driver.findElement(By.name("birthday_day"));
		Select day=new Select (BdayDd);
		day.selectByValue("1");
		WebElement BmonDd = driver.findElement(By.id("month"));
		Select mon=new Select (BmonDd);
		mon.selectByValue("7");
		WebElement ByearDd = driver.findElement(By.id("year"));
		Select year=new Select (ByearDd);
		year.selectByValue("1983");
		
		
		
	}

}
