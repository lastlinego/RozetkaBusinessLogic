package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreditPage extends AnyPage {
    public CreditPage(PageManager pages) {
        super(pages);
    }

    Actions actions;

    @FindBy(xpath = "//div[@class='credit-rules-list']/div")
    private List<WebElement> creditRules;

    @FindBy(xpath = "//div[@class='rz-credit-block']/h2[contains (text(),'Условия кредитования')]")
    private WebElement titleOfTheCreditTable;

    @FindBy(xpath = "//td[@class='rz-credit-terms-td rz-credit-terms-td-age'][contains(text(),'21-70')]")
    private WebElement ageAlfaBank;

    public int listOfCreditRules() {
        return creditRules.size();
    }

    public String creditTableTitle() {
        return titleOfTheCreditTable.getText();
    }

    public String creditAgeAlfaBank() {
        return ageAlfaBank.getText();
    }

    public CreditPage scrollCreditPage() {
        actions = new Actions(driver);
        actions.moveToElement(ageAlfaBank);
        actions.perform();
        return this;
    }
}
