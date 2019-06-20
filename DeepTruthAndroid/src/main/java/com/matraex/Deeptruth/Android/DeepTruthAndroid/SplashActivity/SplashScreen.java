package com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SplashScreen {
	protected static  WebDriver driver;
	//To create an object of Desired Capabilities
	  protected DesiredCapabilities caps = new DesiredCapabilities();
	
	@BeforeTest
	  public void setup() throws MalformedURLException {
		
		//To Setup the device name and Id
		  caps.setCapability("deviceName", "device");
		  caps.setCapability("deviceid","Z55DRCKRZHDMA6BU");
		  
		  caps.setCapability("platformName", "Android");
		  caps.setCapability("platformVersion", "6.0");
		//set the package of the app
		  caps.setCapability("appPackage", "com.deeptruth.app.composer.android");
		// set the launcher activity of the app
		  caps.setCapability("appActivity", "com.deeptruth.app.android.activity.splashactivity");	
		
		//driver object with new Url and Capabilities
		  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		//WebDriver driver = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"),caps);
		//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	/* public void setup() throws MalformedURLException {
			
			//To Setup the device name and Id
			  caps.setCapability("deviceName", "device");
			  caps.setCapability("deviceid","Z55DRCKRZHDMA6BU");
			  
			  caps.setCapability("platformName", "Android");
			  caps.setCapability("platformVersion", "8.1.0");
			//set the package of the app
			  caps.setCapability("appPackage", "com.deeptruth.app.composer.android");
			// set the launcher activity of the app
			  caps.setCapability("appActivity", "com.deeptruth.app.android.activity.splashactivity");	
			
			//driver object with new Url and Capabilities
			  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
			//WebDriver driver = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"),caps);
			//AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }*/
	
	@AfterTest
	public void close() {
//		driver.close();
		
	}
}
