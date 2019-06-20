package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MediaList extends VideoRecording {
	@Test(enabled=false)
	public void medialistAllMedia() {
//		driver.findElement(By.id("com.deeptruth.app.composer.android:id/img_mediathumbnail")).click();// click on media thumb nail
//		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'img_mediathumbnail')]")).click();
//		driver.findElement(By.className("android.widget.ImageView")).click();
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.ImageView' and @index='0']")).click();
		
		driver.findElement(By.id("img_videothumbnail")).click();/// click on the video
		driver.findElement(By.id("img_btn_playpause")).click();// click on the video play button
		
		
	}

}
