package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverBasedHelper {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    public DriverBasedHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        pages = new PageManager(driver);
    }
}
