package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragObject {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		WebElement fm = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(fm);
		Thread.sleep(3000);
		
		WebElement s = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement d = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(s, d).perform();
		

	}

}
