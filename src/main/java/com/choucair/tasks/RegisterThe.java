package com.choucair.tasks;

import com.choucair.interactions.Coordinates;
import com.choucair.interactions.DropDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.userinterface.RegisterPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class RegisterThe implements Task {
    private String userName;
    private String lastName;
    private String identificationNumber;
    private String mobileNumber;
    private String email;

    public RegisterThe(
            String userName,
            String lastName,
            String identificationNumber,
            String mobileNumber,
            String email) {

        this.userName = userName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public static RegisterThe exitoAppRegister(
            String userName,
            String lastName,
            String identificationNumber,
            String mobileNumber,
            String email) {

        return Tasks.instrumented(
                RegisterThe.class,
                userName,
                lastName,
                identificationNumber,
                mobileNumber,
                email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(REGISTER_BUTTON, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(REGISTER_BUTTON),
                WaitUntil.the(INPUT_NAME, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userName).into(INPUT_NAME),
                WaitUntil.the(INPUT_LAST_NAME, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                DropDown.dropList("com.exito.appcompania:id/filled_exposed_dropdown", "C.E"),
                WaitUntil.the(INPUT_IDETIFICATION, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(identificationNumber).into(INPUT_IDETIFICATION),
                Click.on(DROPDOWN_YEAR),
                Coordinates.guideCoordinates(88, 1013),
                Click.on(DROPDOWN_MONTH),
                Coordinates.guideCoordinates(290, 1068),
                Click.on(DROPDOWN_DAY),
                Coordinates.guideCoordinates(509, 1013),
                Coordinates.guideCoordinates(59, 895),
                Coordinates.guideCoordinates(59, 942),
                WaitUntil.the(INPUT_MOBILE, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(mobileNumber).into(INPUT_MOBILE),
                WaitUntil.the(INPUT_EMAIL, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(email).into(INPUT_EMAIL),
                WaitUntil.the(CONFIRM_BUTTON, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(CONFIRM_BUTTON)
        );
    }

}
