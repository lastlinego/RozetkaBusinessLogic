package com.rozetkabusinesslogic.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditPageElements extends TestBase {


    @Test
    public void openCreditPage() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTitleOfPage(), "Купить в кредит. Способ оформления кредита");
    }

    @Test
    public void creditPageRulesSize() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getNumberOfElementsCredit(),4);
    }

}
