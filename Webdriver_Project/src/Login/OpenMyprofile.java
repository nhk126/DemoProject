package Login;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class OpenMyprofile {

	public static void main(String[] args) throws IOException {
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile mypr = profile.getProfile("myprofile");
		
		FirefoxDriver driver = new FirefoxDriver(mypr);
		driver.get("http://jqueryui.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:/Users/dhava/SeleniumTest/Test.png"));
	}

}
