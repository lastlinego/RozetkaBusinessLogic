package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends TestBase {

    User user = new User().setName("Vovka").setEmail("tester5@gmail.come").setPass("Qwerty1");

    @Test
    public void createNewUser() {
        app.getNavigationHelper().navigateToRegistrationPage();
        app.getUserHelper().register(user);
        Assert.assertEquals(app.getNavigationHelper().getHeadingMyProfile(), "Личные данные");

    }
}
