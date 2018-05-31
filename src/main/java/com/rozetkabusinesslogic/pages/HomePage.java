package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(xpath = "//a[text()='Войти в личный кабинет']")
    private WebElement signInButtonHomePage;

    @FindBy(xpath = "//input[@class='input-text auth-input-text'][@name='login']")
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='auth-f-i']//input[@type='password']")
    private WebElement passField;

    @FindBy(xpath = "//button[@type='submit'][contains(text(),'Войти')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Войти в личный кабинет']")
    private WebElement signInBtn;

    @FindBy(xpath = "//a[text()='Регистрация']")
    private WebElement signUpBtn;

    @FindBy(xpath = "//span[@id='header_user_menu_parent']/a[@name='profile']")
    private WebElement myProfileBtn;


    public MyProfilePage openPageAsLoggedUser() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='header_user_menu_parent']/a[@name='profile']")));
        myProfileBtn.click();
        return pages.myProfilePage;
    }

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

    public HomePage clickSignInBtnHomePage() {
        signInButtonHomePage.click();
        return pages.homePage;
    }

    public HomePage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public HomePage setPassword(String password) {
        passField.sendKeys(password);
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
