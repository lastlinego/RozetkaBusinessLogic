package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.User;
import org.testng.annotations.Test;

public class Registration extends TestBase {

    @Test
    public void createNewUser() throws InterruptedException {
        User user = new User().setName("Vovka").setEmail("tester@gmail.come").setPass("Qwerty1");
        app.getNavigationHelper().navigateToRegistrationPage();
        Thread.sleep(2000);
        app.getUserHelper().register(user);

    }
}
