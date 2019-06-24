package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen.IntroScreen;

public class VideoRecording extends IntroScreen {
	
	@Test(enabled=false)//priority=1,
	public void videoRecord() throws InterruptedException, IOException {
		
//		Drawer.openSwipeClose();
		
		//click on start video record button
		driver.findElement(By.id("layout_recorder")).click();
		
		Thread.sleep(10000);
		
		//click on stop video record button
		driver.findElement(By.id("layout_recorder")).click(); 
		
	}
		
}
