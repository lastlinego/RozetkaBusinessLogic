package com.rozetkabusinesslogic.applogic;

import com.rozetkabusinesslogic.pages.MyProfilePage;

public interface INavigationHelper {

    void openMainPage();
    void navigateToHomePage();
    void navigateToCreditPage();
    void navigateToRegistrationPage();
    void navigateToLoginPopUp();
    MyProfilePage navigateToMyProfileAsLogged();
}
