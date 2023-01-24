package com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {

    public static final Target ALLOW_BUTTON = Target.the("The button that accepts access to the location")
            .located(By.id("com.android.packageinstaller:id/permission_allow_button"));

    public static final Target MOBILE_BUTTON = Target.the("The icon for purchase mobile phone")
            .located(By.xpath("//android.widget.TextView[@text=\"Celulares\"]"));

    public static final Target DELIVERY_LABEL = Target.the("Delivery's group view")
            .located(By.id("com.exito.appcompania:id/appCompatTextView_title"));

    public static final Target DELIVERY_BUTTON = Target.the("The home delivery option")
            .located(By.id("com.exito.appcompania:id/constraitLayout_user_address"));

    public static final Target CONTINUE_BUTTON = Target.the("The continue button")
            .located(By.id("com.exito.appcompania:id/appCompatButton_continue"));

    public static final Target ADD_BUTTON = Target.the("The add button")
            .located(By.xpath("//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]//android.widget.TextView[@text=\"Agregar\"]"));

    public static final Target ADD_ITEM = Target.the("Adds one more product")
            .located(By.id("com.exito.appcompania:id/appCompatImageView_add_item"));

    public static final Target CART_BUTTON = Target.the("The cart button")
            .located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));

}
