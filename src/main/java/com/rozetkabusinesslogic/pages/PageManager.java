package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

    private WebDriver driver;

    public HomePage homePage;
    public CreditPage creditPage;
    public MyProfilePage myProfilePage;
    public RegistrationPage registrationPage;
    public SearchResultsPage searchResultsPage;
    public NoteBookPage noteBookPage;
    public AsusPage asusPage;


    public PageManager(WebDriver driver) {
        this.driver = driver;
        homePage = initElements(new HomePage(this));
        creditPage = initElements(new CreditPage(this));
        registrationPage = initElements(new RegistrationPage(this));
        myProfilePage = initElements(new MyProfilePage(this));
        searchResultsPage = initElements(new SearchResultsPage(this));
        noteBookPage = initElements(new NoteBookPage(this));
        asusPage = initElements(new AsusPage(this));

    }

    private <T extends Page> T initElements(T page) {
        PageFactory.initElements(driver, page);
        return page;
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
