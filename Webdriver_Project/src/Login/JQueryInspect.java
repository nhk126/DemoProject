package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryInspect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/spinner");
		driver.manage().window().maximize();
		
		//Switch to frame
		WebElement fm = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(fm);
		driver.findElement(By.xpath(".//*[@id='spinner']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='getvalue']")).click();
		Thread.sleep(3000);
		
		//Switch to Alert and accept it
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Switch to default page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[11]/a")).click();
		
		//To move slider
		WebElement fm2 = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(fm2);
		Thread.sleep(3000);
		
		WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 700, 0).perform();
		//driver.switchTo().defaultContent();
		
		//Draggable action
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		WebElement fm3 = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(fm3);
		driver.findElement(By.xpath(".//*[@id='draggable']"));
		action.dragAndDropBy(fm, 300, 700);
		
	}

}
