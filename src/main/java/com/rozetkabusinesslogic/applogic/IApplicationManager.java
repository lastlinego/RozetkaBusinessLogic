package com.rozetkabusinesslogic.applogic;

import com.rozetkabusinesslogic.applogic2.UserHelper;
import org.openqa.selenium.WebDriver;
import com.rozetkabusinesslogic.applogic2.NavigationHelper;


public interface IApplicationManager {

        NavigationHelper getNavigationHelper();
        UserHelper getUserHelper();

        WebDriver getWebdriver();


        void stop();

        void close();
    }

