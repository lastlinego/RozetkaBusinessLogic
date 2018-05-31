package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.applogic2.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeTest()
    public void init() {

        if (app == null) {
            app = new ApplicationManager();
        }

        app.getNavigationHelper().openMainPage();

    }


//    @AfterSuite
//    public void tearDown() {
//        app.stop();
//    }
}
