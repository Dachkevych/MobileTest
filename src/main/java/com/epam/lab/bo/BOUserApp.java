package com.epam.lab.bo;

import com.epam.lab.model.User;
import com.epam.lab.vo.VOApp;

public class BOUserApp {
    VOApp app = new VOApp();

    public void pressButtonCreate() {
        app.getButtonUserRegistration().click();
    }

    public void setUserTextAria(User user) {
        app.getUserName().sendKeys(user.getName());
        app.getUserMail().sendKeys(user.getEmail());
        app.getUserPassword().sendKeys(user.getPassword());
        app.getSpiner().click();
        app.getCheckText().click();
        app.getCheckBox().click();
        app.getUserRegistration().click();
    }

    public boolean checkUserCreate() {
        return app.getUserFinishRegistrationButton().isEnabled();
    }
}
