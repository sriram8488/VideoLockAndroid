package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen.IntroScreen;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.LginScreen.LoginPage;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.SettingScreen.Setting;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;

import io.appium.java_client.TouchShortcuts;

public class MediaList extends IntroScreen {
	@Test(priority=1,enabled=true)//priority=2,
	public void medialistAllMedia() throws InterruptedException, IOException {
		
		Drawer.openSwipeClose();
		
		VideoRecording.startVideoRecord();

		Thread.sleep(5000);
		VideoRecording.stoptVideoRecord();
		Thread.sleep(3000);
		
		// click on media thumb nail

		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_mediathumbnail') and @index='0']")).click();
		Thread.sleep(5000);

		/*
		// click to see the grid view
		driver.findElement(By.id("lay_gridstyle")).click(); 
		
		// click to see list view
		driver.findElement(By.xpath(" //android.widget.ImageView[contains(@resource-id,'btn_gallerylist')and @index='0']")).click();
		// click on the folder icon 
		driver.findElement(By.id("img_folder")).click();
		// click on the plus '+' icon to create a folder
		driver.findElement(By.id("img_plus_icon")).click();
		// name the folder name as New Folder
		driver.findElement(By.id("edt_inputdata_1")).sendKeys("New Folder");
		// click on ok
		driver.findElement(By.id("tv_positive")).click();
		// Click on back button to go back to All Media 
		driver.findElement(By.id("img_arrow_back")).click();
		// finish the work in setting page
		Setting.settings();
		/// click on the video	
//		driver.findElement(By.id("img_videothumbnail")).click();
 * */
 
	// slide a video from right to left
		Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  int startx = (int) (size.width * 0.70);
		 int endx = (int) (size.width * 0.20);
		int  starty = size.height /3;
		  System.out.println("Start swipe operation");
		  int timeduration = 3000;
		((TouchShortcuts) driver).swipe(startx, starty, endx, starty, timeduration );
		
		// click on share button 
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id, 'img_slide_share') and @index= '0']")).click();
		
		//click on private
		driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'linear_share_btn1')]")).click();
		
		LoginPage.login();
		
		
		
		 
		
		
		
		//click on the camera
//		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_camera')and @index='0']")).click();
	}

		public void rightLeftSwipe(int timeduration) {

			 

			 }	
		
	
		
		
	}


