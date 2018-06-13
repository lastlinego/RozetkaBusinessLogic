package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.Product;
import org.testng.annotations.Test;

public class FindProduct extends TestBase {

    Product product = new Product().setProductName("BOSCH SMV 24 AX 00 K");

    @Test
    public void findSomeProduct() {
        app.getProductHelper().searchProduct(product);
    }
}
