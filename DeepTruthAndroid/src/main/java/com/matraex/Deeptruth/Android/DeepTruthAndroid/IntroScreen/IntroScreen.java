package com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen;

import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;
import io.appium.java_client.MobileBy;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntroScreen extends SplashScreen{
	
  
@Test(priority=0, enabled=true)
  public void splashActivityScreeen() throws InterruptedException, IOException {
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// for RECORD NOW button
	WebElement recordNowButton= driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'btn_start_record')]"));
	/*WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(recordNowButton));*/
	recordNowButton.click();
	Thread.sleep(5000);
	  
      for(int i=1; i<=4; i++)
		  {
    	  //allow buttons to access everything on device
		  driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click(); 
		  } 
      		// allowing location
		  driver.findElement(MobileBy.id("txt_allow")).click(); 
		  // allow to record
		 driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click(); 
		  
	   }
   
}