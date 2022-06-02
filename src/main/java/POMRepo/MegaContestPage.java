package POMRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MegaContestPage {
	@AndroidFindBy(xpath="//android.widget.TextView[@text='₹45 Lakhs']")
	private MobileElement expextedResult;
	
	public MobileElement getExpextedResult() {
		return expextedResult;
	}


	public MobileElement getMegaText() {
		return megaText;
	}


	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mega Contest']")
	private MobileElement megaText;
	
	public MegaContestPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
}
