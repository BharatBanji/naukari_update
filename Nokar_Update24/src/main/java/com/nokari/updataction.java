package com.nokari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class updataction {
	public static void main(String args[]) throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
	// launch the firefox browser
		driver.get("https://www.naukri.com/");
	
		//Actions act = new Actions(driver);
		//	WebElement ele =   driver.findElement(By.xpath("//*[text()=\"View & Update Profile\"]"));
		//			act.doubleClick(ele).perform();	
		// click on login button 
		driver.findElement(By.xpath("//a[@href=\"https://login.naukri.com/nLogin/Login.php\"]")).click();
	//click on e-mail ID
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("veerbharat35@gmail.com");
	//click on password
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("8650459076banji#");	
	// click on login button
		driver.findElement(By.xpath("//button[@class=\"btn-primary loginButton\"]")).click();	
	//click on view profile
		 Thread.sleep(1000);
	        //driver.findElement(By.xpath("//*[@class=\"nI-gNb-drawer__bars\"]")).click();
	        driver.findElement(By.xpath("//*[@class=\"nI-gNb-drawer__bars\"]")).click();
	        Thread.sleep(1000);
	       // driver.findElement(By.xpath("//*[text()=\"View & Update Profile\"]")).click();
	        driver.findElement(By.xpath("//*[text()=\"View & Update Profile\"]")).click();
	        Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@class=\"icon edit\"]")).click();
	      driver.findElement(By.xpath(" //*[@id=\"saveBasicDetailsBtn\"]")).click(); 
	       driver.findElement(By.xpath(" //*[@id=\"attachCV\"]")).sendKeys("C:\\Users\\Admin\\Documents\\pre\\Bharat_Veer 2yrs.pdf");
	       Thread.sleep(5000);
		
		
		driver.close();
	}

}
