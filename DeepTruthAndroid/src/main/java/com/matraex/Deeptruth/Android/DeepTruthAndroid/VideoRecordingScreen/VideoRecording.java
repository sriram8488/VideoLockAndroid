package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VideoRecording extends com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen.IntroScreen {
	
	@Test(priority=1,enabled=true)
	public void videoRecord() throws InterruptedException, IOException {
		
//		Drawer.openSwipeClose();
		driver.findElement(By.id("layout_recorder")).click();//click on start video record button
		Thread.sleep(10000);
		
		driver.findElement(By.id("layout_recorder")).click(); //click on stop video record button
		
	}
		
}
