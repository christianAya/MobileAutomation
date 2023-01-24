package com.choucair.interactions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class DropDown implements Interaction {

    private String path;
    private String key;

    public DropDown(String path, String key) {
        this.path = path;
        this.key = key;
    }

    public static DropDown dropList(String path, String key ){
        return Tasks.instrumented(DropDown.class, path, key);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver android = getProxiedDriver();
        android.findElement(By.id(path)).clear();
        android.findElement(By.id(path)).sendKeys(key);
    }
}
