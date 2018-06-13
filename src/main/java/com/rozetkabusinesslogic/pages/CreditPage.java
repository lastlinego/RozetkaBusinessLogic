package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreditPage extends AnyPage {
    public CreditPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='credit-rules-list']/div")
    private List<WebElement> creditRules;

    public int listOfCreditRules() {
        return creditRules.size();
    }
}
