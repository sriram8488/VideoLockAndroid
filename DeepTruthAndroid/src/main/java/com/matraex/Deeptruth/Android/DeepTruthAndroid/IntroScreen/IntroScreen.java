package com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen;

import org.testng.annotations.Test;


import com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen.VideoRecording;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class IntroScreen extends com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen{
	
  
@Test(priority=0)
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