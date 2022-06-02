package POMRepo;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MatchPage {
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"Match_Card_1\\\"]/android.widget.TextView[6]")
	private MobileElement timeStamp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='₹1 Crore']")
	private MobileElement actualResult;
	
	public MobileElement getTimeStamp() {
		return timeStamp;
	}

	public MobileElement getActualResult() {
		return actualResult;
	}

	public MobileElement getCard1() {
		return card1;
	}

	@AndroidFindBy(xpath="Match_Card_1")
	private MobileElement card1;
	
	//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[8]
	public MatchPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void timeStamp(AndroidDriver driver) {
		card1.click();
	}
}
