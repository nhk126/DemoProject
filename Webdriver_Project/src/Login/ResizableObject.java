package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableObject {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement fm = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(fm);
		Thread.sleep(3000);
		
		WebElement a = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(a, 250, 390).perform();

	}

}
