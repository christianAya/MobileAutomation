package com.choucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target WELCOME_TEXT = Target.the("Welcome message")
            .located(By.id("com.exito.appcompania:id/AppCompatTextView_title_access"));

    //com.exito.appcompania:id/widget_appbar
}
