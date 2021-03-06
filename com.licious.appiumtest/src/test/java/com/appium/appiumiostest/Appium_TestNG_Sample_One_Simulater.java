package com.appium.appiumiostest;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;





public class Appium_TestNG_Sample_One_Simulater {

private static  IOSDriver<MobileElement> driver;

@Test
public void f() {
    
    try
    {
        WebElement element=driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> swipeObject = new HashMap<String, String>();
        swipeObject.put("direction", "left");
        swipeObject.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: swipe", swipeObject);
        Thread.sleep(1000);
        WebElement getStartedBtn=driver.findElement(By.id("LET'S GET STARTED"));
        getStartedBtn.click();
        Thread.sleep(1000);
 WebElement location=   driver.findElement(By.id("Search for your Delivery location"));
 
 location.sendKeys("Indira Nagar");
 
 driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Indira Nagar\"])[1]")).click();
 Thread.sleep(2000);
 //driver.findElement(By.id("Chicken")).click();
 driver.findElementByAccessibilityId("Today's Deals-bk").click();
 //WebElement marinadesItem=driver.findElementByAccessibilityId("Marinades");
 //JavascriptExecutor executor = (JavascriptExecutor)driver;

 //executor.executeScript("arguments[0].click();", marinadesItem);
 //driver.findElement(By.id("Weekend Treats")).click();
 Thread.sleep(500);
 driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ADD TO CART\"])[1]")).click();
 Thread.sleep(500);
 driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Licious\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
 Thread.sleep(500);
 driver.findElementByAccessibilityId("facebook").click();
 Thread.sleep(500);
 WebDriverWait wait = new WebDriverWait(driver, 20);
 try {
     wait.until(ExpectedConditions.alertIsPresent());
     Thread.sleep(500);
     driver.switchTo().alert().accept();
     Thread.sleep(1000);
 } catch (Exception e) {
     System.err.println("   no alert visible after "+20+" sec.");
    
 }
 Thread.sleep(1000);
 driver.findElementByAccessibilityId("Email address or phone number").sendKeys("8884948076");
 Thread.sleep(500);
 driver.findElementByAccessibilityId("Facebook password").sendKeys("12345");
 Thread.sleep(500);
 driver.findElementByName("Log In").click();
 //location.sendKeys(Keys.DOWN,Keys.ENTER);
//WebElement useLocation=driver.findElement(By.id("Use Loaction"));
//useLocation.click();
    }catch(Exception e)
    {
        
    }
}

@BeforeMethod
public void beforeMethod() throws MalformedURLException, InterruptedException {
    //File classpathRoot = new File(System.getProperty("user.dir"));
    //File appDir = new File(classpathRoot, "/Apps/Amazon/");
    //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");    
    DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
   // TouchAction touchAction ;
    capabilities.setCapability("deviceName", "iPhone SE");
    
    Thread.sleep(500);
    capabilities.setCapability("platformName", "iOS");
    Thread.sleep(500);
    capabilities.setCapability("platformVersion", "11.4");
    //capabilities.setCapability("deviceName", "iPhone Simulator");
    capabilities.setCapability("Identifier", "0EC8AD7E-5A5D-4D2A-B0C7-CB683C68FC33");
    Thread.sleep(500);
    capabilities.setCapability("automationName", "XCUITest");
    Thread.sleep(500);
    //capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
    //capabilities.setCapability("app", app.getAbsolutePath());
    capabilities.setCapability("app", "//Users/deepa/Downloads/Licious.app");
    Thread.sleep(500);
   // capabilities.setCapability("noReset", "noReset");
   // capabilities.setCapability("autoAcceptAlerts",true);
    driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 20);
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    } catch (Exception e) {
        System.err.println("   no alert visible after "+20+" sec.");
       
    }
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(500);
        driver.switchTo().alert().dismiss();
        
    } catch (Exception e) {
        System.err.println("   no alert visible after "+20+" sec.");
       
    }

    
//    (new TouchAction(driver))
//    .press(PointOption.point(294, 556))
//    .moveTo(PointOption.point(45, 556))
//    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//    .release()
//    .perform(); 
    
}

@AfterMethod
public void afterMethod() {
}
}
