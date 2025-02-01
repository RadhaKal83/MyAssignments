package week4.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("accept-choices")).click();
	 // Switch to the frame containing the button
    driver.switchTo().frame("iframeResult");
 // Find the "Try It" button and click it
    WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
    tryItButton.click();
    // Handle the alert
    Alert alert = driver.switchTo().alert();
    
    // Enter text into the alert and accept it
    String alertText = "Frame Test";
    alert.sendKeys(alertText);
    alert.accept();
    // Verify the text displayed after accepting the alert
    WebElement resultText = (WebElement) driver.findElement(By.id("demo"));
    if (resultText.getText().contains(alertText)) {
        System.out.println("Verified the text");
    } else {
        System.out.println("No Text Verified");
    }
    
    // Close the browser
    driver.quit();
}
}
