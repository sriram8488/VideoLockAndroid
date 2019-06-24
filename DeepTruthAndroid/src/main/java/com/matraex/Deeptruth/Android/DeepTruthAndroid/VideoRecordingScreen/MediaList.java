package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SettingScreen.Setting;

import io.appium.java_client.MobileElement;

public class MediaList extends VideoRecording {
	@Test(enabled=true)//priority=2,
	public void medialistAllMedia() throws InterruptedException {

		Thread.sleep(5000);
		
		// click on media thumb nail
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_mediathumbnail') and @index='0']")).click();
		Thread.sleep(5000);

		
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
		
		
		
		
		
		
		//click on the camera
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_camera')and @index='0']")).click();
		
		
		
	
		
		
	}

}
