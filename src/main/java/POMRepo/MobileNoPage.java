package POMRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileNoPage {
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email or mobile no']")
	private MobileElement MobNoText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NEXT']")
	private MobileElement NextBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	private MobileElement AllowBtn;
	
	public MobileElement getMobNoText() {
		return MobNoText;
	}

	public void MobNoPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public MobileElement getNextBtn() {
		return NextBtn;
	}
	public MobileElement getAllowBtn() {
		return AllowBtn;
	}

	public void MobNoTextField(AndroidDriver driver) {
		MobNoText.sendKeys("8220609624");
		NextBtn.click();
		AllowBtn.click();
	}

}
