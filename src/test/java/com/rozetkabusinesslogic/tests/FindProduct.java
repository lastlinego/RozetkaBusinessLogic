package com.rozetkabusinesslogic.tests;

import com.rozetkabusinesslogic.model.Product;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindProduct extends TestBase {

    Product product = new Product().setProductName("BOSCH SMV 24 AX 00 K");

    @Test
    public void findSomeProduct() {
        app.getProductHelper().searchProduct(product);
        app.getProductHelper().addProductToCart();
        Assert.assertEquals(app.getProductHelper().getTextOfProductInCart(),"Встраиваемая посудомоечная машина BOSCH SMV 24 AX 00 K + 0% кредит или сертификат Розетка 500 грн в подарок!");
    }
}
