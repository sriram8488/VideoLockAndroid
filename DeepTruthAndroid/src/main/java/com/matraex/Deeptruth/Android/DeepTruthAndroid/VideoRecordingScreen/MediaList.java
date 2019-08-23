package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen.IntroScreen;
import io.appium.java_client.TouchShortcuts;

public class MediaList extends IntroScreen {
	
	public static void clickOnMediaThumbnail() {
		// click on media thumb nail
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_mediathumbnail') and @index='0']")).click();
		}
		
		public static void clickOnGridView() {
		// click to see the grid view
		driver.findElement(By.id("lay_gridstyle")).click(); 
		}
		
		public static void clickOnListView() {
		// click to see list view
		driver.findElement(By.xpath(" //android.widget.ImageView[contains(@resource-id,'btn_gallerylist')and @index='0']")).click();
		}
		
		public static void clickOnFolderIcon() {
		// click on the folder icon 
		driver.findElement(By.id("img_folder")).click();
		}
		
		public static void clickOnCreateFolder() {
		// click on the plus '+' icon to create a folder
		driver.findElement(By.id("img_plus_icon")).click();
		}
		
		public static void nameTheCreatedFolder() {
		// name the folder name as New Folder
		driver.findElement(By.id("edt_inputdata_1")).sendKeys("New Folder");
		// click on ok
		driver.findElement(By.id("tv_positive")).click();
		}
		
		public static void clickOnBackButton() {
		// Click on back button to go back to All Media 
		driver.findElement(By.id("img_arrow_back")).click();
		}
		
		public static void clickOnVideo() {
		// click on the video	
		driver.findElement(By.id("img_videothumbnail")).click();
		}
		 public void swipefromLeftToRight() {
			 swipefromLeftToRight();
		}

		 public static void swipefromRightToLeft() {
			 swipefromRightToLeft();
		}
		 
		
		public static void clickOnShareButton() {
		// click on share button 
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id, 'img_slide_share') and @index= '0']")).click();
		}
		
		public static void clickOnPrivate() {
		//click on private
		driver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'linear_share_btn1')]")).click();
		}
		
		public static void clickOnCameraIcon() {		
		//click on the camera
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_camera')and @index='0']")).click();
		}		
		
	}


