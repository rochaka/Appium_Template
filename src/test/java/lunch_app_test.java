import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class lunch_app_test {
    static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException {
    openMobileApp();
    }

        public static void openMobileApp() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Rochaka");
            cap.setCapability("udid", "R58T20MJGCN");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "13");
            cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability("appPackage", "com.ubercab");
            cap.setCapability("appActivity", "com.ubercab.presidio.app.core.root.RootActivity ");

            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, cap);
            System.out.println("Session created successfully!");
    }
}

