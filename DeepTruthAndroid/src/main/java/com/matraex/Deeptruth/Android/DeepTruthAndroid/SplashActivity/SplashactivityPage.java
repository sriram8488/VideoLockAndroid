package com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity;

import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.TestBase.Base;
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

public class SplashactivityPage extends Base{
	
  
@Test
  public void splashActivityScreeen() throws InterruptedException, IOException {
	
	  driver.findElement(By.id("btn_start_record")).click(); // for RECORD NOW button
	 Thread.sleep(5000);
	  
      for(int i=1; i<=4; i++)
		  {
		  driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click(); //allow buttons to access everything on deice
		  } 
    
		  driver.findElement(MobileBy.id("txt_allow")).click(); // allowing location
    
		 driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click(); // allow to record
		  
	   }
   
}