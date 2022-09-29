package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private AndroidDriver driver;

    public AndroidDriver createDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel4");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.deskclock");
        caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
