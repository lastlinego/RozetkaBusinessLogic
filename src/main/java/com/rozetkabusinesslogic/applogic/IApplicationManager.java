package com.rozetkabusinesslogic.applogic;

import org.openqa.selenium.WebDriver;
import com.rozetkabusinesslogic.applogic2.NavigationHelper;


public interface IApplicationManager {

        NavigationHelper getNavigationHelper();

        WebDriver getWebdriver();


        void stop();

        void close();
    }

