package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.applogic.INavigationHelper;

public class NavigationHelper extends DriverBasedHelper implements INavigationHelper {
    private String baseUrl;


    public NavigationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseUrl = manager.getBaseUrl();
    }

    @Override
    public void openMainPage() {
        driver.get(baseUrl);
    }

    @Override
    public void openRelativeUrl(String url) {

    }

    @Override
    public void switchToNewTab() {

    }

    @Override
    public void refreshPage() {
        super.driver.navigate().refresh();
    }

    @Override
    public void navigateToHomePage() {

    }

    @Override
    public void navigateToCreditPage() {
        pages.homePage.openCreditLink();
    }

    public void navigateToRegistrationPage() {
        pages.homePage.openRegistrationPage();
    }

    public String getTitleOfPage() {
        return pages.creditPage.getTitle();
    }

    public String getHeadingOfTheCart() {
        return pages.homePage.cartTitle();
    }

    public String getHeadingMyProfile() {
        return pages.myProfilePage.myProfileTitle();
    }

    public void pressButtonCart() {
        pages.homePage.openCart();
    }
}
