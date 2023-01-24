package com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucair.userinterface.CartPage.LABEL_CART_MESSAGE;


public class VerifyCart implements Question<Boolean> {

    private String cartMessage;

    public VerifyCart(String cartMessage) {
        this.cartMessage = cartMessage;
    }

    public static VerifyCart the(String cartMessage){
        return new VerifyCart(cartMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(LABEL_CART_MESSAGE).viewedBy(actor).asString();
        return !cartMessage.equals(answer);
    }
}
