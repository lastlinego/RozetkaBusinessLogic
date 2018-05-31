package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.applogic.IProductHelper;

public class ProductHelper extends DriverBasedHelper implements IProductHelper {
    public ProductHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }


}
