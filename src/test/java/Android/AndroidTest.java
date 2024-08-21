package Android;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {
    public static AndroidDriver driver;
    @Test
    public void androidTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("udid", "10341c3e0508");
        capabilities.setCapability("deviceName", "Redmi 10 Prime");
        capabilities.setCapability("appPackage", "com.crmlah.crmlah");
        capabilities.setCapability("appActivity", "com.crmlah.crmlah.MainActivity");

        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(url, capabilities);
    }
}
