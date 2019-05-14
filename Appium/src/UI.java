import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class UI extends mytest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((RemoteWebElement) driver.findElementsByAndroidUIAutomator("text(\"Views\")")).click();
		driver.findElementByAndroidUIAutomator("new UiSelection().clicable(true)").getSize();
	}

}
