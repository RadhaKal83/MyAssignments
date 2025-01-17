package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCheckBox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
