package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreditPage extends AnyPage {
    public CreditPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='credit-rules-list']/div")
    private List<WebElement> creditRules;

    @FindBy(xpath = "//div[@class='rz-credit-block']/h2[contains (text(),'Условия кредитования')]")
    private WebElement titleOfTheCreditTable;

    @FindBy(xpath = "//td[@class='rz-credit-terms-td rz-credit-terms-td-age'][contains(text(),'21-70')]")
    private WebElement ageAlfaBank;

    @FindBy(className = "rz-credit-terms-table")
    private WebElement tableElement;

    By rows = By.xpath("//tr[@class='rz-credit-terms-tr']");

    By columnNameList = By.xpath("//td[@class='rz-credit-terms-td']");

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

    public String creditTableItems(String nameOfTheProductPackage, String columnName) {
        List<WebElement> rowList = tableElement.findElements(rows);
        List<WebElement> columnList = tableElement.findElements(columnNameList);

        for (WebElement row : rowList) {
            if (row.getText().contains(nameOfTheProductPackage)) {
                for (int i = 0; i < columnList.size(); i++) {
                    WebElement result = columnList.get(i);
                    if (result.getText().contains(columnName)) {
                        return row.findElements(By.className("rz-credit-terms-td")).get(i).getText();
                    }
                }
            }
        }

        return "not found";
    }

}
