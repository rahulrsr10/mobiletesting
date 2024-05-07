package rahulrode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemosPage {
	
	AndroidDriver driver;

	APIDemosPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Element Locators
	@AndroidFindBy(accessibility  ="Access'ibility")
	WebElement access1;
	
	@AndroidFindBy(accessibility  ="Accessibility")
	WebElement access2;
	
	@AndroidFindBy(accessibility  ="Animation")
	WebElement animation;
	
	@AndroidFindBy(accessibility  ="App")
	WebElement app;
	
	@AndroidFindBy(accessibility  ="Graphics")
	WebElement graphic;
	
	@AndroidFindBy(accessibility  ="Media")
	WebElement media;
	
	@AndroidFindBy(accessibility  ="Media")
	WebElement nfc;
	
	@AndroidFindBy(accessibility  ="OS")
	WebElement os;
	
	@AndroidFindBy(accessibility  ="Preference")
	WebElement preference;
	
	@AndroidFindBy(accessibility  ="Text")
	WebElement text;
	
	@AndroidFindBy(accessibility  ="Views")
	WebElement views;
	
	@AndroidFindBy(accessibility  ="Content")
	WebElement content;
	
	//Action methods
	
	public void clickOnAccess1Button() {
		access1.click();
	}
	
	public void clickOnAccess2Button() {
		access2.click();
	}
	
	public void clickOnanimationButton() {
		animation.click();
	}
	
	public void clickOnAppButton() {
		app.click();
	}
	
	public void clickOngraphicButton() {
		graphic.click();
	}

	public void clickOnmediaButton() {
		media.click();
	}
	
	public void clickOnnfcButton() {
		nfc.click();
	}
	
	public void clickOnosButton() {
		os.click();
	}
	
	public void clickOnpreferenceButton() {
		preference.click();
	}
	
	public void clickOntextButton() {
		text.click();
	}
	
	public void clickOnviewsButton() {
		views.click();
	}
	
	public void clickOnContentButton() {
		content.click();
	}
}
