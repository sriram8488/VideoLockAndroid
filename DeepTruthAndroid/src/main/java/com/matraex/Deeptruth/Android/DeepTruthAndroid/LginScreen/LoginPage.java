package com.matraex.Deeptruth.Android.DeepTruthAndroid.LginScreen;

import org.openqa.selenium.By;
import com.matraex.Deeptruth.Android.DeepTruthAndroid.SplashActivity.SplashScreen;

public class LoginPage extends SplashScreen  {
	
	public static void login() {
		
		//enter emailid
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_username')]")).sendKeys("harimohan98@gmail.com");
		//enter password
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edt_password')]")).sendKeys("12345");
		//click on loginbutton
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'login')]")).click();
		///clickk on create account
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'createaccount')]")).click();
		// click on forgot password
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'forgot_password')]")).click();
	}

}
