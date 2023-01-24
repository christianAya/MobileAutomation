package com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage extends PageObject {
    public static final Target ADDRESS_LABEL = Target.the("The label that verify the address")
            .located(By.xpath("//android.widget.TextView[@resource-id=\"com.exito.appcompania:id/appCompatTextView_title\"][@text=\"Agrega tu dirección\"]"));
    public static final Target DROPDOWN_DEPARTMENT = Target.the("The droppdown's department")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_department"));
    public static final Target DROPDOWN_CITY = Target.the("The dropdown's city")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_city"));
    public static final Target INPUT_ADDRESS = Target.the("The address input 4")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_address\"]//android.widget.EditText"));
    public static final Target ADD_ADDRESS_BUTTON = Target.the("The address input 4")
            .located(By.id("com.exito.appcompania:id/appCompatButton_add_address"));


}
