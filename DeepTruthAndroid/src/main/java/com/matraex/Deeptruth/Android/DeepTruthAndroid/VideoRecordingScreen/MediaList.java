package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MediaList extends VideoRecording {
	@Test(priority=2,enabled=true)
	public void medialistAllMedia() throws InterruptedException {
//		driver.findElement(By.id("com.deeptruth.app.composer.android:id/img_mediathumbnail")).click();// click on media thumb nail
//		driver.findElement(By.className("android.widget.ImageView")).click();
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")).click();
//		driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @index='0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_mediathumbnail') and @index='0']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.id("img_videothumbnail")).click();/// click on the video

		driver.findElement(By.id("lay_gridstyle")).click();// click to see the grid view
		driver.findElement(By.id("img_folder")).click();// click on the folder icon 
//		driver.findElement(By.id("com.deeptruth.app.reader.android:id/img_btn_playpause")).click();// click on the video play button
		
		
	}

}
