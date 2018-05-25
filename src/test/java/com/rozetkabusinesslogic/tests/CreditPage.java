package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditPage extends TestBase {

    User user = new User().setEmail("email").setPass("pass");

    @Test
    public void openCreditPage() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTitleOfPage(), "Купить в кредит. Способ оформления кредита");
    }

    @Test
    public void openCreditPage2() {
        app.getUserHelper().login(user);
        Assert.assertEquals(app.getNavigationHelper().getTitleOfPage(), "Купить в кредит. Способ оформления кредита");
    }

    @Test
    public void openCreditPage3() {
        app.getUserHelper().login(new User().setEmail("email").setPass("pass"));
        Assert.assertEquals(app.getNavigationHelper().getTitleOfPage(), "Купить в кредит. Способ оформления кредита");
    }

}
