package com.rozetkabusinesslogic.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheCart extends TestBase {

    @Test
    public void checkIfTheCartIsEmpty() {
        app.getNavigationHelper().openMainPage();
        Assert.assertEquals(app.getNavigationHelper().getHeadingOfTheCart(), "Корзина пуста");

    }
}
