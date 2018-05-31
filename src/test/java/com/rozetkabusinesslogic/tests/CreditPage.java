package com.rozetkabusinesslogic.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditPage extends TestBase {


    @Test
    public void openCreditPage() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTitleOfPage(), "Купить в кредит. Способ оформления кредита");
    }

}
