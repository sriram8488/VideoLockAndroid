package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;


import java.io.IOException;
import org.openqa.selenium.By;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;

public class VideoRecording extends SplashScreen {
	
	
	public static   void startVideoRecord() throws InterruptedException, IOException {
				
		//click on start video record button
			driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id, 'layout_recorder') ]")).click();
	}
		
		
		public static  void stoptVideoRecord() {
		
		//click on stop video record button
			driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id, 'layout_recorder') ]")).click(); 
		
	}
		
}
