package com.rozetkabusinesslogic.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotebookPageElements extends TestBase {

    @Test
    public void sizeOfTheBrands() {
        app.getNavigationHelper().navigateToNoteBookPage();
        Assert.assertEquals(app.getNavigationHelper().getSizeOfTheBrands(), 8);
    }
}
