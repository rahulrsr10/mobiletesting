package rahulrode;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TestClass extends BaseTest {
	
	@Test
	public void testAllElements() throws InterruptedException {
		APIDemosPage apidemospage=new APIDemosPage(driver);
		apidemospage.clickOnAccess1Button();
		driver.navigate().back();
		apidemospage.clickOnAccess2Button();
		driver.navigate().back();
		apidemospage.clickOnanimationButton();
		driver.navigate().back();
		apidemospage.clickOnAppButton();
		driver.navigate().back();
		apidemospage.clickOnContentButton();
		driver.navigate().back();
		apidemospage.clickOngraphicButton();
		driver.navigate().back();
		apidemospage.clickOnmediaButton();
		driver.navigate().back();
		apidemospage.clickOnnfcButton();
		driver.navigate().back();
		apidemospage.clickOnosButton();
		driver.navigate().back();
		apidemospage.clickOnpreferenceButton();
		driver.navigate().back();
		apidemospage.clickOntextButton();
		driver.navigate().back();
		apidemospage.clickOnviewsButton();
		driver.navigate().back();
	}
	
	@Test
	public void testStopWatch() throws InterruptedException {
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
	
	@Test
	public void testTextBox() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Text")).click();
		driver.navigate().back();

	}


}
