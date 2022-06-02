package POMRepo;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_clientAndroidDriver driver;
	

public class LoginPage {
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Log In']")
	private MobileElement loginBtn;
	
	public LoginPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public MobileElement getCountrydd() {
		return loginBtn;
	}
	public void loginBtn(AndroidDriver driver) {
		loginBtn.click();
	}
}
