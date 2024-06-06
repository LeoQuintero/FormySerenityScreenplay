package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.tasks.FillOutTheForm;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.co.choucair.utils.GlobalData.ACTOR;
import static com.co.choucair.utils.GlobalData.URL;

public class AutoCompleteStepDefinitions {

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the actor was on the website")
    public void theActorWasOnTheWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("he proceeds to fill out the form")
    public void heProceedsToFillOutTheForm(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillOutTheForm.on(UserLoombokData.setData(dataTable).get(0))
        );

    }
    @Then("he will see a confirmation message")
    public void heWillSeeAConfirmationMessage() {

    }



}
