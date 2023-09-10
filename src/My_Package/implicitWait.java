package My_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class implicitWait {
	public void implicitWaitMethod(WebDriver driver) {
		
		// providing maximum 10 seconds time to complete load the webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
