import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends mytest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.Textview[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.Textview[@text='3. Preference dependencies']").click();
		((RemoteWebElement) driver.findElementsById("android:id/checkbox")).click();
		driver.findElementByXPath("//android.widget.RelativeLayout[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		((List<AndroidElement>) driver.findElementByClassName("android.widget.Button")).get(2).click();
		
		
		
		
	}

}