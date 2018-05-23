package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AnyPage {
    public HomePage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "(//a[@class='whitelink'])[2]")
    private WebElement creditLink;

    public CreditPage openCreditLink() {
        creditLink.click();
        return pages.creditPage;
    }
}
