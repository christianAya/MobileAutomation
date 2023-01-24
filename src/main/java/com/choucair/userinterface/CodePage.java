package com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CodePage extends PageObject {

    public static final Target TEXT_LABEL = Target.the("Where text confirmation page code")
            .located(By.id("com.exito.appcompania:id/AppCompatTextView_bienvenido"));
}
