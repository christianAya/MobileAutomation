package com.choucair.tasks;

import com.choucair.interactions.Coordinates;
import com.choucair.interactions.Down;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.choucair.userinterface.AddressPage.*;
import static com.choucair.userinterface.DashboardPage.*;
import static com.choucair.util.Util.waitProccess;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DashboardThe implements Task {

    public static DashboardThe exitoPurchase() {
        return Tasks.instrumented(DashboardThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Check.whether(WebElementQuestion.the(ALLOW_BUTTON), isClickable())
                        .andIfSo(
                                Click.on(ALLOW_BUTTON)
                        ),

                WaitUntil.the(MOBILE_BUTTON, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(MOBILE_BUTTON),

                Check.whether(WebElementQuestion.the(DELIVERY_LABEL), isCurrentlyVisible())
                        .andIfSo(
                                WaitUntil.the(DELIVERY_BUTTON, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                                Click.on(DELIVERY_BUTTON),
                                Check.whether(WebElementQuestion.the(ADDRESS_LABEL), isCurrentlyVisible())
                                        .andIfSo(
                                                Click.on(DROPDOWN_DEPARTMENT),
                                                Down.downEvent(),
                                                Click.on(DROPDOWN_CITY),
                                                Coordinates.guideCoordinates(100, 407),
                                                Click.on(DROPDOWN_CITY),
                                                WaitUntil.the(INPUT_ADDRESS, isEnabled()).forNoMoreThan(10).seconds(),
                                                Click.on(INPUT_ADDRESS),
                                                Enter.theValue("Calle Falsa 123").into(INPUT_ADDRESS),
                                                Click.on(ADD_ADDRESS_BUTTON)
                                        ),
                                WaitUntil.the(CONTINUE_BUTTON, isClickable()).forNoMoreThan(15).seconds(),
                                Click.on(CONTINUE_BUTTON)
                        ),

                Check.whether(WebElementQuestion.the(ADD_BUTTON), isClickable())
                        .andIfSo(
                                Click.on(ADD_BUTTON)
                        )
                        .otherwise(
                                Click.on(ADD_ITEM)
                        ),
                WaitUntil.the(CART_BUTTON, isCurrentlyVisible()).forNoMoreThan(15).seconds(),
                Click.on(CART_BUTTON)
        );
        waitProccess(8000);
    }
}
