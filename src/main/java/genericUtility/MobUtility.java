package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MobUtility extends BaseClasss {
	
	public static AndroidDriver driver;
	public static void tapActions(AndroidDriver driver,int fingers, WebElement element, int duration) {
		driver.tap(fingers, element, duration);
	}
	
	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream fisForProp = new FileInputStream("./propertyFile.properties");
		Properties property = new Properties();
		property.load(fisForProp);
		return property.getProperty(key);
	}
	
}
