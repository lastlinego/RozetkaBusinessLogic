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

    @Test
    public void titleOfCreditTable() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTitleOfCrediTable(), "Условия кредитования");
    }

    @Test
    public void checkTheAgeAlfaBank() {
        app.getNavigationHelper().navigateToCreditPage();
        app.getNavigationHelper().scrollToAlfaAge();
        Assert.assertEquals(app.getNavigationHelper().getAgeAlfaBank(), "21-70");
    }

    @Test
    public void checkTheTableInfo() {
        app.getNavigationHelper().navigateToCreditPage();
        Assert.assertEquals(app.getNavigationHelper().getTheTableItemsInformation(), "15");
    }


}
