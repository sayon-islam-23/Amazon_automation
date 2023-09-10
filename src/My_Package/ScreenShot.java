package My_Package;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //TakesScreenshot is an interface in selenium which use to take screenshots of a browser.
		TakesScreenshot scrShot =((TakesScreenshot)webdriver); // converting the webdriver object into TakeScreenshot

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //setting up the destination file to save the screenshots
        File DestFile=new File(fileWithPath);

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
