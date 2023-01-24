package com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("The login button")
            .located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));

    public static final Target EMAIL_INPUT = Target.the("Input email")
            .located(By.id("com.exito.appcompania:id/TextInputEditText_email"));

    public static final Target PASSWORD_INPUT = Target.the("Input email")
            .located(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.exito.appcompania:id/CustomEditText_password\"]//android.widget.EditText"));


}
