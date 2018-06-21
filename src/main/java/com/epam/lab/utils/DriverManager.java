package com.epam.lab.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.epam.lab.utils.Constants.*;

public class DriverManager {

    public static AndroidDriver driver;
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    static {
        File directory = new File(APPS_PATH);
        File app = new File(directory, APPLICATIONS_NAME);

        capabilities.setCapability(CapabilityType.BROWSER_NAME, CHROME);
        capabilities.setCapability("device", ANDROID);

        capabilities.setCapability("appPackage", "io.selendroid.testapp");
        capabilities.setCapability("appActivity", ".HomeScreenActivity");

        capabilities.setCapability("deviceName", GOOGLE_NEXUS_5);
        capabilities.setCapability("platformName", ANDROID);
        capabilities.setCapability("platformVersion", VERSION_5_0);

        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("noReset", true);
    }

    private DriverManager() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
        }
        return driver;
    }
}
