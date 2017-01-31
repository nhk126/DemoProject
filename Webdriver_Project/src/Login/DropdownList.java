package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		WebElement a=Driver.findElement(By.id("year"));
		Select dropdown = new Select(a);
		
		dropdown.selectByValue("1984");
		
		List<WebElement> options = dropdown.getOptions();
		System.out.println("Total number of element: "+options.size());
		
		for(int i=0; i<options.size(); i++){
			System.out.println(options.get(i).getText());
		}
		
	}

}
