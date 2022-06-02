package POMRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EnglishPage {
	@AndroidFindBy(xpath="//android.widget.Button[@text='CONTINUE IN ENGLISH']")
	private MobileElement englishBtn;
	
	public EnglishPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public MobileElement getEnglishBtn() {
		return englishBtn;
	}
	public void englishBtn(AndroidDriver driver) {
		englishBtn.click();
	}


	



}
