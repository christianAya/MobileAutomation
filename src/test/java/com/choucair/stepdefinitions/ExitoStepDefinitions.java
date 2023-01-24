package com.choucair.stepdefinitions;

import com.choucair.questions.VerifyCart;
import com.choucair.questions.VerifyWith;
import com.choucair.tasks.DashboardThe;
import com.choucair.tasks.LoginThe;
import com.choucair.tasks.OpenThe;
import com.choucair.tasks.RegisterThe;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.util.Util.CART_MESSAGE;
import static com.choucair.util.Util.CONFIRMATION_PAGE;

public class ExitoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I that user wants to enter the Exito application")
    public void iThatUserWantsToEnterTheExitoApplication() {
        OnStage.theActorCalled("I").wasAbleTo(OpenThe.exitoApp());
    }

    @When("I enter with the user information {string}, {string}, {string}, {string}, {string}")
    public void iEnterWithTheUserInformation(String userName, String lastName, String identificationNumber, String mobileNumber, String email) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterThe
                .exitoAppRegister(userName, lastName, identificationNumber, mobileNumber, email));
    }

    @Then("I should see the code page")
    public void iShouldSeeTheCodePage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWith.the(CONFIRMATION_PAGE)));
    }

    @And("I login with the email {string} and the password {string}")
    public void iLoginWithTheEmailAndThePassword(String email, String password) {
        OnStage.theActorCalled("I").wasAbleTo(LoginThe.exitoLogin(email,password));
    }

    @When("I add a product to the cart")
    public void IAddAProductToTheTart(){
        OnStage.theActorInTheSpotlight().attemptsTo(DashboardThe.exitoPurchase());
    }

    @Then("I should see the product in my cart")
    public void IShouldSeeTheProductoInMyCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCart.the(CART_MESSAGE)));
    }

}
