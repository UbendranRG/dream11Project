package dream11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genericUtility.BaseClasss;
import io.appium.java_client.android.AndroidKeyCode;

public class dream11 extends BaseClasss {

	@Test
	public void tc() throws InterruptedException
	{
		WebElement loginButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Log In']"));
		m.tapActions(driver, 1, loginButton, 500);
		WebElement mobNo = driver.findElement(By.xpath("//android.widget.EditText[@text='Email or mobile no']"));
		mobNo.sendKeys("8220609624");
		WebElement nextButton = driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
		m.tapActions(driver, 1, nextButton, 500);
		WebElement allowButton = driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']"));
		m.tapActions(driver, 1, allowButton, 500);
		Thread.sleep(7000);
		WebElement englishButton = driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE IN ENGLISH']"));
		m.tapActions(driver, 1, englishButton, 500);		
		String timeStamp = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[6]")).getText();
		if(timeStamp.contains("24h")) {
			System.out.println("MEGA label is not displayed");
		}
			else {
				WebElement megaLabel = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[8]"));
				if(megaLabel.isDisplayed()) {
					System.out.println("MEGA label displayed");
				}
			}
		String actualResult = driver.findElement(By.xpath("//android.widget.TextView[@text='$45 Lakhs']")).getText();
		System.out.println("Actual Result = "+actualResult);
		WebElement card1Tap = driver.findElementByAccessibilityId("Match_Card_1");
		m.tapActions(driver, 1, card1Tap, 500);
		String expectedResult = driver.findElement(By.xpath("//android.widget.TextView[@text='$45 Lakhs']")).getText();
		System.out.println("Expected Result = "+expectedResult);
		if(actualResult.contains(expectedResult)) {
			System.out.println("Amount is same");
		}
		else {
			System.out.println("Amount is not same");
		}
		String contestText = driver.findElement(By.xpath("//android.widget.TextView[@text='Mega Contest']")).getText();
		if(contestText.contains("Mega Contest")) {
			System.out.println("Mega Contest Present in contest listing screen");
		}
		else {
			System.out.println("Mega Contest is not Present in contest listing screen");
		}
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_HOME);
				
}
	
}

