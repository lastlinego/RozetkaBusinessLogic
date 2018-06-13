package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NotebookPage extends AnyPage {
    public NotebookPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='pab-cell pab-img-45']")
    private List<WebElement> brandsList;

    @FindBy(xpath = "//a[@class='m-cat-subl-i-link'][contains(text(), 'Asus')]")
    private WebElement asusBtn;

    @FindBy(xpath = "//a[@class='m-cat-subl-i-link'][contains(text(),'10 000 грн - 12 999 грн')]")
    private WebElement filter10kBtn;

    public int numberOfTheBrands() {
        return brandsList.size();
    }

    public AsusPage asusBtn() {
        asusBtn.click();
        return pages.asusPage;
    }

    public NotebookPageWithFilter clickFilter10Btn() {
        filter10kBtn.click();
        return pages.notebookPageWithFilter;
    }
}
