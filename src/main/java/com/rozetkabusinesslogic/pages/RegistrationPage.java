package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AnyPage {
    public RegistrationPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//input[@name='title']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passField;

    @FindBy(xpath = "//button[@class='btn-link-i'][contains(text(),'Зарегистрироваться')]")
    private WebElement registrationBtn;


    public RegistrationPage setName(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage setPass(String pass) {
        passField.sendKeys(pass);
        return this;
    }

    public MyProfilePage clickRegistrationBtn() {
        registrationBtn.click();
        return pages.myProfilePage;
    }
}
