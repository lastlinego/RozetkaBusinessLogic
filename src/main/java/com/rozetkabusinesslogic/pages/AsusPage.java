package com.rozetkabusinesslogic.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AsusPage extends AnyPage {
    public AsusPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='g-i-tile g-i-tile-catalog']")
    private List<WebElement> defaultAsusItems;

    @FindBy(xpath = "//div[@id='filter_viewlist']")
    private WebElement listViewBtn;

    @FindBy(xpath = "//div[@class='g-i-list available'] | //div[@class='g-i-list out_of_stock'] | //div[@class='g-i-list limited']")
    private List<WebElement> listOfTheItems;

    private By list = By.xpath("//div[@class='g-i-list available'] | //div[@class='g-i-list out_of_stock'] | //div[@class='g-i-list limited']");

    @FindBy(xpath = "//span[@class='g-i-more-link-text']")
    private WebElement loadMoreItemsBtn;

    @FindBy(xpath = "//div[@class='g-i-list available'] | //div[@class='g-i-list out_of_stock'] | //div[@class='g-i-list limited']")
    private List<WebElement> listOfTheItemsLoadMore;

    public int listOfTheAsusDefault() {
        return defaultAsusItems.size();
    }

    public AsusPage cliclListViewBtn() {
        listViewBtn.click();
        return this;
    }

    public int itemsInTheListView() {
        wait.until(ExpectedConditions.presenceOfElementLocated(list));
        return listOfTheItems.size();
    }

    public AsusPage loadMoreBtn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='g-i-list available'] | //div[@class='g-i-list out_of_stock'] | //div[@class='g-i-list limited']")));
        loadMoreItemsBtn.click();
        return this;
    }

    public int itemsAfterLoadMore() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='g-i-list available'] | //div[@class='g-i-list out_of_stock'] | //div[@class='g-i-list limited']")));
        return listOfTheItemsLoadMore.size();
    }

}
