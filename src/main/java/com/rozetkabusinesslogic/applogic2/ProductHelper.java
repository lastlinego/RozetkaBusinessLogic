package com.rozetkabusinesslogic.applogic2;

import com.rozetkabusinesslogic.applogic.IProductHelper;
import com.rozetkabusinesslogic.model.Product;

public class ProductHelper extends DriverBasedHelper implements IProductHelper {
    public ProductHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    public void searchProduct(Product product){
        pages.homePage
                .setProductName(product.getProductName())
                .clickSearchBtn();
    }

    public void addProductToCart() {
        pages.searchResultsPage.clickBuyBtn();
    }

    public String getTextOfProductInCart() {
        return pages.searchResultsPage.getNameOfTheLot();
    }



}
