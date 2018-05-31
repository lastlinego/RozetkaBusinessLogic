package com.rozetkabusinesslogic.applogic;

import com.rozetkabusinesslogic.pages.MyProfilePage;

public interface INavigationHelper {

    void openMainPage();
    void openRelativeUrl(String url);
    void switchToNewTab();
    void refreshPage();
    void navigateToHomePage();
    void navigateToCreditPage();
    void navigateToRegistrationPage();
    void navigateToLoginPopUp();
    MyProfilePage navigateToMyProfileAsLogged();
}
