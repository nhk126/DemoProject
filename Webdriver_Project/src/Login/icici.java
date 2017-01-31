package Login;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='push-modal-content']/div[2]/div/p[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li[4]/a")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(".//*[@id='Search']")).sendKeys("VIRGINIA");
		Set<String> WinIDs = driver.getWindowHandles();
		Iterator<String> s = WinIDs.iterator();
		
		String first_id = s.next();
		System.out.println(first_id);
		String second_id = s.next();
		System.out.println(second_id);
		
	}

}
