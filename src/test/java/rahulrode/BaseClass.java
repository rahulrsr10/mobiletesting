package rahulrode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	BaseClass(AndroidDriver driver){
		this.driver=driver;
	}
	
	@BeforeMethod
	public void startup(AndroidDriver driver) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("deviceName", "RahulPhone");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("app", "D:\\APKFiles\\resources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}

}
