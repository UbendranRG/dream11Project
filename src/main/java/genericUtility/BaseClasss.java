package genericUtility;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClasss {

	public static  AndroidDriver driver;
	//public static AndroidDriver sdriver;
	public FileUtils f=new FileUtils();
	public  MobUtility m=new MobUtility();
	
	@BeforeSuite
	public void database() {
		System.out.println("Database connection");
	}
	@AfterSuite
	public void closeDatabase() {
		System.out.println("Close database connection");
	}
	/*@BeforeTest
	public void parallel() {
		System.out.println("parallel execution");
	}
	@AfterTest
	public void parellel1() {
		System.out.println("parallel execution");
	}
	@BeforeClass
	public void startServer() {
		server=AppiumDriverLocalService.buildDefaultService();
		server.start();
	}
	
	@AfterClass
	public void stopServer() {
		server.stop();
	}*/
	@BeforeMethod
	public void launchApp() throws IOException {

		/*
		 LoginPage login=new LoginPage(driver);
		 EnglishPage english=new EnglishPage(driver); 
		 MatchPage match=new MatchPage(driver);
		 MegaContestPage login=new MegaContestPage(driver);
		 MobileNoPage mob=new MobileNoPage(driver);
		 */
		String device_Name = f.getDataFromPropertyFile("deviceName");
		String platform_Name = f.getDataFromPropertyFile("platformName");
		String platform_Version = f.getDataFromPropertyFile("platformVersion");
		String device_ID = f.getDataFromPropertyFile("deviceID");
		String app_Package=f.getDataFromPropertyFile("appPackage");
		String app_Activity=f.getDataFromPropertyFile("appActivity");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device_Name);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_Name);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_Version);
		cap.setCapability(MobileCapabilityType.UDID, device_ID);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appPackage", "com.app.dream11Pro");
		cap.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
		
		//sdriver=driver;
		URL url= new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//login.loginBtn();
		//mob.MobNoTextField();
		//english.englishBtn();
		//match.timeStamp();
		
		
	}
	@AfterMethod
	public void closeApp() {
		driver.closeApp();
	}
}
