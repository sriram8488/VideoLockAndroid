package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;

import io.appium.java_client.TouchShortcuts;

public class Drawer extends SplashScreen {
	//static WebDriver driver;
	
	public static void openDrawer() {
		// open drawer
		driver.findElement(By.id("img_lefthandle")).click();
		
	}
	public static void closeDrawer() {	
		// close drawer
		driver.findElement(By.id("img_righthandle")).click();
	}
	public static void swipeVertically() throws InterruptedException {
		
		for(int i=0; i<=9; i++) {
		Dimension size=driver.manage().window().getSize();
		int width=(int)(size.width/2);
		int startPoint=(int)(size.getHeight() * 0.70);
		
		int endPoint=(int)(size.getHeight() * 0.20);
		
		int duration=1000;
		((TouchShortcuts) driver).swipe(width, startPoint, width, endPoint, duration);
		}
	}
	public static void openSwipeClose() throws InterruptedException {
		openDrawer();
		swipeVertically();
		closeDrawer();
		
	}
}
