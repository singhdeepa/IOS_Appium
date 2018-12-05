package in.appium.appiumiostest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_Android {

private static  AndroidDriver<MobileElement> driver;
	//private static  WebDriver  driver;

@Test
public void f() throws Throwable {
    
    
    	 Thread.sleep(5000);
        //driver.findElementById("passwd").sendKeys("Password@123");
        Thread.sleep(5000);
      WebElement applyNow=    driver.findElement(By.id("Apply Now"));
      applyNow.click();
      TouchActions action = new TouchActions(driver);
      action.singleTap(applyNow);
      action.perform();


          Thread.sleep(8000);
   
    
}

@BeforeMethod
public void beforeMethod() throws MalformedURLException, InterruptedException {
    //File classpathRoot = new File(System.getProperty("user.dir"));
    //File appDir = new File(classpathRoot, "/Apps/Amazon/");
    //File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");    
    DesiredCapabilities capabilities = new DesiredCapabilities();
    //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    //DesiredCapabilities caps = DesiredCapabilities.android();
 //   caps.setCapability("appiumVersion", "1.5.3");
    capabilities.setCapability("platformName","android");
    capabilities.setCapability("platformVersion","6.0.1");
    capabilities.setCapability("deviceName","Redmi");
    
   
    capabilities.setCapability("noReset","true");
    capabilities.setCapability("automationName","uiautomater2");
    
  //  capabilities.setCapability("app","/Users/deepa/Downloads/Licious.apk");
    capabilities.setCapability("appPackage","com.csam.icici.bank.imobile");
    capabilities.setCapability("appActivity","com.csam.icici.bank.imobile.IMOBILE");
    
   // capabilities.setCapability("automationName", "XCUITest");
    Thread.sleep(500);
 //   capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
    //capabilities.setCapability("app", app.getAbsolutePath());
   // capabilities.setCapability("app", "/Users/deepa/Downloads/dev-3.3.27-bug-fix.apk");
    Thread.sleep(500);
    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 20);
//    try {
//        wait.until(ExpectedConditions.alertIsPresent());
//        Thread.sleep(500);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//    } catch (Exception e) {
//        System.err.println("   no alert visible after "+20+" sec.");
//       
//    }
//    try {
//        wait.until(ExpectedConditions.alertIsPresent());
//        Thread.sleep(500);
//        driver.switchTo().alert().dismiss();
//        
//    } catch (Exception e) {
//        System.err.println("   no alert visible after "+20+" sec.");
//       
//    }
    
}

@AfterMethod
public void afterMethod() {
}
}
