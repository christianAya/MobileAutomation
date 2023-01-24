package com.choucair.tasks;

import com.choucair.util.Util;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenThe implements Task {
    public static OpenThe exitoApp() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Util.waitProccess(5000);
    }
}