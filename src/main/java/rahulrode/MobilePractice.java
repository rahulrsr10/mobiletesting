package rahulrode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobilePractice {
	public static AndroidDriver driver;
	Assert assertion;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("deviceName", "RahulPhone");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "D:\\APKFiles\\resources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Chronometer")).click();
		String timer = driver.findElement(AppiumBy.id("io.appium.android.apis:id/chronometer")).getText();
		Assert.assertEquals(timer, "Initial format: 00:00");
		driver.findElement(AppiumBy.accessibilityId("Start")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Stop")).click();
		timer = driver.findElement(AppiumBy.id("io.appium.android.apis:id/chronometer")).getText();
		System.out.println(timer);
		
		driver.findElement(AppiumBy.accessibilityId("Start")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Stop")).click();
		timer = driver.findElement(AppiumBy.id("io.appium.android.apis:id/chronometer")).getText();
		System.out.println(timer);
		
	
		
	}

}
