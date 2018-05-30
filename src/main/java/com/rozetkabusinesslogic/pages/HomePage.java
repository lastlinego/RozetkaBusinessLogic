package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AnyPage {
    public HomePage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "(//a[@class='whitelink'])[2]")
    private WebElement creditLink;

    @FindBy(xpath = "//span[@class='xhr'][contains(text(), 'Корзина')]")
    private WebElement cartButton;

    @FindBy(xpath = "//h2[@class='empty-cart-title inline sprite-side']")
    private WebElement cartHeading;

    @FindBy(xpath = "")
    private WebElement emailField;

    @FindBy(xpath = "")
    private WebElement passField;

    @FindBy(xpath = "")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Войти в личный кабинет']")
    private WebElement signInBtn;

    @FindBy(xpath = "//a[text()='Регистрация']")
    private WebElement signUpBtn;


    public CreditPage openCreditLink() {
        creditLink.click();
        return pages.creditPage;
    }

    public HomePage openCart() {
        cartButton.click();
        return pages.homePage;
    }

    public String cartTitle() {
        cartButton.click();
        return cartHeading.getText();
    }

    public HomePage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public HomePage setPassword(String password) {
        emailField.sendKeys(password);
        return this;
    }

    public MyProfilePage clickLoginBtn() {
        loginBtn.click();
        return pages.myProfilePage;
    }


    public RegistrationPage openRegistrationPage() {
        signUpBtn.click();
        return pages.registrationPage;
    }

}
