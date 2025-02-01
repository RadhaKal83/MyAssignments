package week4.HomeAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.ajio.com/.");
		driver.manage().window().maximize();	
		WebElement searchBox = driver.findElement(By.name("searchVal"));
		 searchBox.sendKeys("bags");
         searchBox.submit();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//label[contains(text(), 'Men')]")).click();
         Thread.sleep(3000); 
         driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]")).click();
         Thread.sleep(3000); 
         WebElement itemCountElement = driver.findElement(By.className("length"));
         String itemCountText = itemCountElement.getText();
         System.out.println("Total items found: " + itemCountText);

         List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));
	        List<String> brands = new ArrayList<>();
	        for (WebElement brand : brandElements) {
	            brands.add(brand.getText());
	        }
	        System.out.println("List of brands:");
	        for (String brand : brands) {
	            System.out.println(brand);
	        }
	        List<WebElement> productNameElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
	        List<String> productNames = new ArrayList<>();
	        for (WebElement productName : productNameElements) {
	            productNames.add(productName.getText());
	        }
	        System.out.println("List of bag names:");
	        for (String productName : productNames) {
	            System.out.println(productName);
	        }

        // driver.quit();
			
	}

}
