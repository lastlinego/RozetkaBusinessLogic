package com.rozetkabusinesslogic.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotebookPageElements extends TestBase {

    @Test
    public void sizeOfTheBrands() {
        app.getNavigationHelper().navigateToNoteBookPage();
        Assert.assertEquals(app.getNavigationHelper().getSizeOfTheBrands(), 8);
    }

    @Test
    public void sizeDefaultAsusItems() {
        app.getNavigationHelper().navigateToNoteBookPage();
        app.getNavigationHelper().clickAsusBtn();
        Assert.assertEquals(app.getNavigationHelper().getDefaultAsusItems(), 32);
    }

    @Test
    public void sizeOfTheListAsus() {
        app.getNavigationHelper().navigateToNoteBookPage();
        app.getNavigationHelper().clickAsusBtn();
        app.getNavigationHelper().changeViewToList();
        Assert.assertEquals(app.getNavigationHelper().getAsusItemsInTheListView(), 16);
    }

    @Test
    public void sizeItemsAfterLoadMore() throws InterruptedException {
        app.getNavigationHelper().navigateToNoteBookPage();
        app.getNavigationHelper().clickAsusBtn();
        app.getNavigationHelper().changeViewToList();
        app.getNavigationHelper().clickLoadMoreBtn();
        Assert.assertEquals(app.getNavigationHelper().getItemsAfterLoadMore(), 32);
    }
}
