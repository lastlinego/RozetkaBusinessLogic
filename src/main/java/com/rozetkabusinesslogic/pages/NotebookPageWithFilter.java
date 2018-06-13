package com.rozetkabusinesslogic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotebookPageWithFilter extends AnyPage {
    public NotebookPageWithFilter(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//a[@class='filter-active-i-link novisited sprite-side']")
    private WebElement nameOfTheFilter;

    @FindBy(xpath = "//a[@class='filter-active-i-link novisited filter-active-i-link-reset sprite-side']")
    private WebElement resetFilterBtn;

    public String nameOfTheSelectedFilter() {
        return nameOfTheFilter.getText();
    }

    public NotebookPageWithFilter pressResetFilterBtn() {
        resetFilterBtn.click();
        return this;
    }
}
