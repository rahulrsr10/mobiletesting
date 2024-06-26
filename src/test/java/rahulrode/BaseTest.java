package rahulrode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public static AndroidDriver driver;
	@BeforeMethod
	public void startup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "13");
		capabilities.setCapability("deviceName", "RahulPhone");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("app", "D:\\APKFiles\\resources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}

}
