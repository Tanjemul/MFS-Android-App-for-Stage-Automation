import java.net.MalformedURLException;


import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.guieffect.qual.UI;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MyApp {
	
	static AppiumDriver driver2;
	static WebDriver driver;
	static AndroidDriver driver3;

	public static void main(String[] args) {
		try {
			tapApp();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}
	
	static void tapApp() throws Exception {
		
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo Y11");
		cap.setCapability("udid", "73aad439");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		//cap.setCapability("autoGrantPermissions", "true");
		//cap.setCapability("autoAcceptAlerts", "true");
		cap.setCapability("fastReset", "true");
		cap.setCapability("appPackage", "com.tad.bdkepler");
		cap.setCapability("appActivity", "com.tad.bdkepler.modules.splash.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);
		System.out.println("Application started successfully......");
		
		
		new WebDriverWait(driver, Duration.ofSeconds(5));
		allMiddleFeatures myMiddleFEatures = new allMiddleFeatures();
		myMiddleFEatures.loginFirst();
		myMiddleFEatures.allMiddleItems("Send Money");
		myMiddleFEatures.allMiddleItems("Cash Out");
		myMiddleFEatures.allMiddleItems("Make Payment");
	}
}
