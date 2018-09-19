package com.appium.utilities;



import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;

import io.appium.java_client.ios.IOSDriver;


 

 

public class ActionEngine {
	 
   // private AndroidDriver driver;
    private static   IOSDriver<MobileElement> driver;
//    public void MobileActions ( IOSDriver<MobileElement> driver) {
//        this.driver = driver;
//    }

 
    //Horizontal Swipe by percentages
    public static void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
       Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
 
//        new TouchAction(driver)
//                .press(startPoint, anchor).waitAction().moveTo(endPoint, anchor).release().perform();
//               
               
    }
 
    

	
}