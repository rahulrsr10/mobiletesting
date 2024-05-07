package rahulrode;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageClass {
	public PageClass(AppiumDriver appiumDriver) {
	      super();
	    }

	@AndroidFindBy(accessibility = "Access'ibility")
	WebElement taskNameTxt;

	public void enterTaskName() {
		taskNameTxt.click();
	}
}
