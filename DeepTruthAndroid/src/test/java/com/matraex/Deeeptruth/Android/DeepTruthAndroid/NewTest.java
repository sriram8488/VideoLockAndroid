package com.matraex.Deeeptruth.Android.DeepTruthAndroid;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen.IntroScreen;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen.Drawer;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen.MediaList;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen.VideoRecording;

public class NewTest {
  @BeforeTest
  public void launch() throws Exception  {
	  SplashScreen.setup();
	 }
  @Test
  public void initro() throws InterruptedException {
	  Thread.sleep(3000);
	  IntroScreen.swipeIntroscreen();
	  IntroScreen.recordNowButton();
	  IntroScreen.clickOnAllowButtons();
	  IntroScreen.clickOnAllowLocation();
	  IntroScreen.clickOnAllowRecord();
	  IntroScreen.allowNotification();
	  }
  @Test
  public void videoRecordScreen() throws InterruptedException, IOException {
	  Drawer.openDrawer();
	  Drawer.swipeVertically();
	  Thread.sleep(3000);
	  Drawer.swipeHorizontally();
	  Drawer.closeDrawer();
	  
	  VideoRecording.startVideoRecord();
	  Drawer.openDrawer();
	  Drawer.swipeVertically();
	  Thread.sleep(3000);
	  Drawer.swipeHorizontally();
	  Drawer.closeDrawer();
	  Thread.sleep(2000);
	  VideoRecording.stoptVideoRecord();
	  
	  Thread.sleep(5000);
	  
	  MediaList.clickOnMediaThumbnail();
	 
  }
  @Test(enabled=false)
  public void allMedia() {
	  MediaList.clickOnGridView();
	  MediaList.clickOnListView();
  }
}
