package appiumtests;





import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

static AppiumDriver<MobileElement> driver;
	
	public static void openCalculator() throws MalformedURLException
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("udid", "67d8e2ef"); 
		//desiredCapabilities.setCapability("deviceName", "sdk_gphone_x86_arm");
		desiredCapabilities.setCapability("deviceName", "OPPO A9 2020");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "10");
        desiredCapabilities.setCapability("appPackage", "com.bng.calculator");
        desiredCapabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
     URL url = new URL("http://127.0.0.1:4723/wd/hub");
     
        driver= new AppiumDriver<MobileElement>(url,desiredCapabilities);
        System.out.println("Application Started .... ");
	}
	
}
