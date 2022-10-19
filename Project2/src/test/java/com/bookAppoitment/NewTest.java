package com.bookAppoitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void BookAppoitment() {
	  wd.get("http://localhost:4200/patient/appointment");
	    
	    wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    
	    WebElement textFiledRef = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-appointment/div/input"));
	    textFiledRef.sendKeys("1");
	    WebElement submitButtonRef = wd.findElement(By.xpath("/html/body/app-root/div/app-patient/div/app-patient-appointment/div/button"));
	    submitButtonRef.click();
  }



WebDriver wd;

@BeforeMethod
public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\phase 5 WorkPhase\\chromedriver_win32\\chromedriver.exe");
		
		 wd = new ChromeDriver();
		 
		
}

@AfterMethod
public void afterMethod() {
}

}