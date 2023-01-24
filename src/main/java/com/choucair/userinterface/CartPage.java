package com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static final Target LABEL_CART_MESSAGE = Target.the("Cart message")
            .located(By.xpath("//android.view.View[@resource-id=\"cartLoadedDiv\"]//android.view.View//android.view.View[1]"));

}
