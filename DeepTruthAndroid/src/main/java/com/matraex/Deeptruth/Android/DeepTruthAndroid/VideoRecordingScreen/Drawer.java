package com.matraex.Deeptruth.Android.DeepTruthAndroid.VideoRecordingScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.TestBase.Base;

import io.appium.java_client.TouchShortcuts;

public class Drawer extends Base {
	//static WebDriver driver;
	
	public static void openDrawer() {
		driver.findElement(By.id("img_lefthandle")).click();// open drawer
		
	}
	public static void closeDrawer() {	
		
		driver.findElement(By.id("img_righthandle")).click();// close drawer
	}
	public static void swipeVertically() throws InterruptedException {
		//TouchAction act=new TouchAction((MobileDriver) driver).press(startx, starty).waitAction().moveTo(endx, endy).release().perform();
		
		Dimension size=driver.manage().window().getSize();
		int width=(int)(size.width/2);
		int startPoint=(int)(size.getHeight() * 0.70);
		System.out.println("started moving");
		Thread.sleep(2000);
		
		int endPoint=(int)(size.getHeight() * 0.20);
		System.out.println("stopped moving");
		int duration=10000;
		((TouchShortcuts) driver).swipe(width, startPoint, width, endPoint, duration);
		
 
}
}
