package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    User user = new User().setEmail("tester4@gmail.come").setPass("Qwerty1");

    @Test
    public void loginToTheSite() {
        app.getNavigationHelper().navigateToLoginPopUp();
        app.getUserHelper().login(user);
        app.getNavigationHelper().navigateToMyProfileAsLogged();
        Assert.assertEquals(app.getNavigationHelper().getHeadingMyProfile(), "Личные данные");


    }
}
