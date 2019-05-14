import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class sourcesafariIOS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		dc.setCapability("platformVersion", "7");
		dc.setCapability("appiumVersion", "1.8.1");
		dc.setCapability("deviceName", "iPhone 6");
		dc.setCapability("browserName", "safari");
		IOSDriver driver=new IOSDriver(new URL("http://diliptest1234:EF57A5E48A744357AEEBB9741896BA53@ondemand.saucelabs.com:80/wd/hub"),dc);
		driver.get("http://google.com");
		Thread.sleep(800L);
	}

}
