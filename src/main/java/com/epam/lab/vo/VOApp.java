package com.epam.lab.vo;

import com.epam.lab.utils.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class VOApp {

    public VOApp(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver(),
                30, TimeUnit.SECONDS),this);
    }

    @AndroidFindBy(id = "startUserRegistrationCD")
    private MobileElement buttonUserRegistration;

    @AndroidFindBy(id = "label_usernameCD")
    private MobileElement userName;

    @AndroidFindBy(id = "email of the customer")
    private MobileElement userMail;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout[2]/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget.EditText[3]")
    private MobileElement userPassword;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout[2]/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget.Spinner")
    private MobileElement spiner;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android." +
            "widget.FrameLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.LinearLayout[2]/android.widget." +
            "ListView/android.widget.CheckedTextView[6]")
    private MobileElement checkText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout[2]/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget.CheckBox")
    private MobileElement checkBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout[2]/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget.Button")
    private MobileElement userRegistration;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android." +
            "widget.LinearLayout/android.widget.FrameLayout[2]/android.widget." +
            "TableLayout/android.widget.TableRow[8]/android.widget.Button")
    private MobileElement userFinishRegistrationButton;

    public MobileElement getButtonUserRegistration() {
        return buttonUserRegistration;
    }

    public MobileElement getUserName() {
        return userName;
    }

    public MobileElement getUserMail() {
        return userMail;
    }

    public MobileElement getUserPassword() {
        return userPassword;
    }

    public MobileElement getSpiner() {
        return spiner;
    }

    public MobileElement getCheckText() {
        return checkText;
    }

    public MobileElement getCheckBox() {
        return checkBox;
    }

    public MobileElement getUserRegistration() {

        return userRegistration;
    }

    public MobileElement getUserFinishRegistrationButton() {

        return userFinishRegistrationButton;
    }
}
