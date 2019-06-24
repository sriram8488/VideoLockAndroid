package com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen;

import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;
import io.appium.java_client.MobileBy;
import java.io.IOException;
import org.openqa.selenium.By;

public class IntroScreen extends SplashScreen{
	
  
@Test()//priority=0
  public void splashActivityScreeen() throws InterruptedException, IOException {
		// for RECORD NOW button
	driver.findElement(By.id("btn_start_record")).click(); 
	Thread.sleep(5000);
	  
      for(int i=1; i<=4; i++)
		  {
    	  //allow buttons to access everything on device
		  driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click(); 
		  } 
      		// allowing location
		  driver.findElement(MobileBy.id("txt_allow")).click(); 
		  // allow to record
		 driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click(); 
		  
	   }
   
}