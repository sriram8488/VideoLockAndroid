package com.matraex.Deeptruth.Android.DeepTruthAndroid.IntroScreen;

import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchShortcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class IntroScreen extends SplashScreen{
	public static void swipefromRightToLeft() {
	 	// slide a video from right to left
		Dimension size = driver.manage().window().getSize();
		  //System.out.println(size);
		  int startx = (int) (size.width * 0.70);
		 int endx = (int) (size.width * 0.10);
		int  starty = size.height/4;
		  //System.out.println("Start swipe operation");
		  int timeduration = 900;
		((TouchShortcuts) driver).swipe(startx, starty, endx, starty, timeduration );
		System.out.println("end swipe operation");
		}
	
  public static void swipeIntroscreen() throws InterruptedException {
	  for (int i = 0; i <= 5; i++) {
		 swipefromRightToLeft();
		 Thread.sleep(3000);
		 
	}
  }
	public static void recordNowButton() {	
	// for RECORD NOW button
	/*WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(recordNowButton));*/
	WebElement recordNowButton= driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'btn_start_record')]"));
	
	recordNowButton.click();
	}
	
	public static void clickOnAllowButtons() { 
      for(int i=0; i<=4; i++)
		  {
    	  //allow buttons to access everything on device
		  driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click(); 
		  } 
	}
	public static void clickOnAllowLocation() {
      		// allowing location
		  driver.findElement(MobileBy.id("txt_allow")).click();
	}
	public static void clickOnAllowRecord() {
		  // allow to record
		 driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click();
	}
		 
		/*String actval= driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'message')]")).getText();
		System.out.println(actval);
		String expval="Please allow app to display on top of other apps.";*/
		
		public static void allowNotification() {
		//Please allow app to display on top of other apps.
		 driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@resource-id,'button1')]")).click();
		 //Permit drawing over other apps
		 MobileElement permit_Btn_On= driver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id, 'switchWidget') and @index='0']"));
		 permit_Btn_On.tap(1, 1);
		 // back to video screen
		 driver.navigate().back();
		}
	   
   
}