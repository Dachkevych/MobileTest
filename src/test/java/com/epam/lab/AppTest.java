package com.epam.lab;

import com.epam.lab.bo.BOUserApp;
import com.epam.lab.model.User;
import com.epam.lab.model.UserReader;
import com.epam.lab.utils.ConfigFileReader;
import com.epam.lab.utils.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static com.epam.lab.utils.Constants.USER_XML_PATH;

public class AppTest {
    private BOUserApp app;
    private AndroidDriver driver;
    private User user;
    private ConfigFileReader fileReader;

    @BeforeClass
    public void start() {
        app = new BOUserApp();
        driver = DriverManager.getDriver();
        fileReader = new ConfigFileReader();
        user = new UserReader().read(new File(USER_XML_PATH));
    }

    @AfterClass
    public void finish() {
        driver.quit();
    }

    @Test
    public void applicationTest() {
        app.pressButtonCreate();
        app.setUserTextAria(user);
        Assert.assertTrue(app.checkUserCreate());
    }
}
