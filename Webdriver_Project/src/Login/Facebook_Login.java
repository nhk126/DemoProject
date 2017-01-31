package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login {

	public static void main(String[] args){
		
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://www.facebook.com");
		Driver.manage().window().maximize();
		String Title = Driver.getTitle();
		System.out.println(Title);
		Driver.findElement(By.name("email")).sendKeys("nhk126@gmail.com");
		Driver.findElement(By.id("pass")).sendKeys("Dhaval!@24");
		Driver.findElement(By.id("email")).clear();
		//Driver.findElement(By.id("u_0_n")).click();
	}

}