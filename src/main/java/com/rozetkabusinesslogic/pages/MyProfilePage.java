package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfilePage extends AnyPage {
    public MyProfilePage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//h1[contains(text(),'Личные данные')]")
    private WebElement headingText;

    public String myProfileTitle() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Личные данные')]")));
        return headingText.getText();
    }
}
