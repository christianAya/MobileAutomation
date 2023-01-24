package com.choucair.interactions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
public class Down implements Interaction {

    public static Down downEvent(){
        return Tasks.instrumented(Down.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AndroidDriver android = getProxiedDriver();
        android.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        android.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
        android.pressKey(new KeyEvent(AndroidKey.ENTER));

    }
}
