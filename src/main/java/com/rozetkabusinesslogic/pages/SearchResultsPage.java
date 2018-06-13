package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends AnyPage {
    public SearchResultsPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//span[@class='sprite-side btn-link btn-link-green detail-buy-btn-link']/button[@type='submit']")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@name='goods-link'][contains(text(),'Встраиваемая посудомоечная машина BOSCH SMV 24 AX ')]")
    private WebElement nameOfTheLot;

    public SearchResultsPage clickBuyBtn(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='sprite-side btn-link btn-link-green detail-buy-btn-link']/button[@type='submit']")));
        buyButton.click();
        return this;
    }

    public String getNameOfTheLot() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='goods-link'][contains(text(),'Встраиваемая посудомоечная машина BOSCH SMV 24 AX ')]")));
        return nameOfTheLot.getText();
    }



}
