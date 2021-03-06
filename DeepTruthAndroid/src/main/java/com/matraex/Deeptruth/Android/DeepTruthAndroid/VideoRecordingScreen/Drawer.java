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
		
		
		for(int i=0; i<=12; i++) {
		Dimension size=driver.manage().window().getSize();
		int width=(int)(size.width/2);
		int startPoint=(int)(size.getHeight() * 0.0);
		
		int endPoint=(int)(size.getHeight() * 0.100);
		
		int duration=300;
		((TouchShortcuts) driver).swipe(width, startPoint, width, endPoint, duration);
		}
	}
public static void swipeHorizontally() throws InterruptedException {
		
		
		for(int i=0; i<=12; i++) {
		Dimension size=driver.manage().window().getSize();
		int width=(int)(size.width/2);
		int startPoint=(int)(size.getHeight() * 0.100);
		
		int endPoint=(int)(size.getHeight() * 0.0);
		
		int duration=300;
		((TouchShortcuts) driver).swipe(width, startPoint, width, endPoint, duration);
		}
	}
}
