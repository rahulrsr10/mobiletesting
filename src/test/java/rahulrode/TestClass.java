package rahulrode;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TestClass extends BaseTest {
	
	@Test
	public void demo() throws InterruptedException {
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
