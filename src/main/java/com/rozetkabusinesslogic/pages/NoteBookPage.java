package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NoteBookPage extends AnyPage {
    public NoteBookPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class='pab-cell pab-img-45']")
    private List<WebElement> brandsList;

    public int numberOfTheBrands() {
        return brandsList.size();
    }
}
