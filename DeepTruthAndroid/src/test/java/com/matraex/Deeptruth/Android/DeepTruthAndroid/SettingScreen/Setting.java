package com.matraex.Deeptruth.Android.DeepTruthAndroid.SettingScreen;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen.MediaList;

import io.appium.java_client.MobileElement;

public class Setting extends MediaList{
  @Test(priority=3, enabled=false)
  public void settings() {
	// click on setting menu
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id, 'img_dotmenu') and @index='4']")).click();
	  
	  //Tap ton switch ON and OFF  the Intro Screen toggle button 
	  MobileElement introscreen_ON= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'togglebutton') and @index='1']"));
	  introscreen_ON.tap(1, 1);
	  MobileElement introscreen_OFF= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'togglebutton') and @index='1']"));
	  introscreen_OFF.tap(1, 1);
	  
	  // tap to switch ON and OFF the Production toggle button 
	  MobileElement production_ON= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'production_toogle') and @index='1']"));
	  production_ON.tap(1, 1);
	  MobileElement production_OFF= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'production_toogle') and @index='1']"));
	  production_OFF.tap(1, 1);
	  
	  // tap to switch ON and OFf the Dev toggle button
	  MobileElement dev_ON= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'togglebutton') and @index='1']"));
	  dev_ON.tap(1, 1);
	  MobileElement dev_OFF= driver.findElement(By.xpath("//android.view.View[contains(@resource-id, 'togglebutton') and @index='1']"));
	  dev_OFF.tap(1, 1);
	  
	  // click on back button
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id, 'img_arrow_back') and @index='4']")).click();
			
	  
  }
}
