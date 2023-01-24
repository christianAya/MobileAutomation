package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginThe implements Task {
    private String email;
    private String password;

    public LoginThe(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginThe exitoLogin(String email, String password) {
        return Tasks.instrumented(LoginThe.class, email, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(WebElementQuestion.the(LOGIN_BUTTON), isCurrentlyEnabled()).andIfSo(
                        Click.on(LOGIN_BUTTON),
                        WaitUntil.the(EMAIL_INPUT, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                        Enter.theValue(email).into(EMAIL_INPUT),
                        WaitUntil.the(PASSWORD_INPUT, isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                        Enter.theValue(password).into(PASSWORD_INPUT),
                        WaitUntil.the(LOGIN_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                        Click.on(LOGIN_BUTTON)
                )
        );
    }
}
