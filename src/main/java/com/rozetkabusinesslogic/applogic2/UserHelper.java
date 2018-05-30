package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.applogic.IUserHelper;
import com.rozetkabusinesslogic.model.User;
import org.openqa.selenium.WebDriver;

public class UserHelper extends DriverBasedHelper implements IUserHelper {
    public UserHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    @Override
    public void login(User user) {
        pages.homePage
                .setEmail(user.getEmail())
                .setPassword(user.getPass())
                .clickLoginBtn();
    }

    @Override
    public void register(User user) {
        pages.registrationPage
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setPass(user.getPass())
                .clickRegistrationBtn();
    }
}
