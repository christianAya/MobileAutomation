package com.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("Register Button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrarse"));
    public static final Target INPUT_NAME = Target.the("Where the user's name is registered")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_nombres\"]//android.widget.EditText"));

    public static final Target INPUT_LAST_NAME = Target.the("Where the user's last name is registered")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_apellidos\"]//android.widget.EditText"));

    public static final Target INPUT_IDETIFICATION = Target.the("Where the user's identification number is registered")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_numero_doc\"]//android.widget.EditText"));

    public static final Target DROPDOWN_YEAR = Target.the("Where the user's identification number is registered")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro"));

    public static final Target DROPDOWN_MONTH = Target.the("Where the user's identification number is registered")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro"));

    public static final Target DROPDOWN_DAY = Target.the("Where the user's identification number is registered")
            .located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro"));

    public static final Target INPUT_MOBILE = Target.the("Where the user's mobile number is registered")
            .located(By.id("com.exito.appcompania:id/TextInputEditText_tel"));

    public static final Target INPUT_EMAIL = Target.the("Where the user's email is registered")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_email_register\"]//android.widget.EditText"));

    public static final Target CONFIRM_BUTTON = Target.the("Button for confirm registration")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_registrar"));
}
