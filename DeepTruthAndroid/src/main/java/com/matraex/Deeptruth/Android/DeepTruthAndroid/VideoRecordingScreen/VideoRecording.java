package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;


import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashactivityPage;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.TestBase.Base;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchShortcuts;

public class VideoRecording extends SplashactivityPage {
	@Test
	public void videoRecord() throws InterruptedException, IOException {
		///Drawer.openDrawer();
//		Thread.sleep(3000);
		//Drawer.swipeVertically();
		//Drawer.closeDrawer();
		
		driver.findElement(By.id("layout_recorder")).click();//click on start video record button
		Thread.sleep(10000);
		driver.findElement(By.id("layout_recorder")).click(); //click on stop video record button
		Thread.sleep(8000);
	}
		
}
