package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class AppiumDriverExCalc {

    public static AppiumDriver getAppiumDriver() {
        // Driver Instance
        AppiumDriver appiumDriver = null;
        try {


            // Set DesiredCapabilities to send to Appium server
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME,"Android");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME,"UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.UDID,"emulator-5554");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_PACKAGE,"com.google.android.calculator");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY,"com.android.calculator2.Calculator");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT,120);

            // Setup the Appium server URL to connect to
            URL appiumServer = new URL("http://localhost:4723/wd/hub");

            appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        } catch (Exception e) {

            e.printStackTrace();

        }
        return appiumDriver;
    }
}
