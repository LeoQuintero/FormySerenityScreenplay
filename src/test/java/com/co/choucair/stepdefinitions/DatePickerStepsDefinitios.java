package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.SelectDate;
import com.co.choucair.userinterfaces.DatepickerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.choucair.utils.GlobalData.ACTOR;
import static com.co.choucair.utils.GlobalData.URL;

public class DatePickerStepsDefinitios {
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the actor is on the Formy homepage")
    public void theActorIsOnTheFormyHomepage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }
    @When("he navigates to the Datepicker page")
    public void heNavigatesToTheDatepickerPage() {

    }
    @And("he selects the date {string} from the calendar")
    public void heSelectsTheDateFromTheCalendar(String date) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDate.fromCalendar(date));
    }

    @Then("Then the selected date {string} should be displayed in the input field")
    public void thenTheSelectedDateShouldBeDisplayedInTheInputField(String date) {
        String formattedDate = date.replace("-", "/");
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(DatepickerPage.DATEPICKER_INPUT).value().isEqualTo(formattedDate)
        );
    }
}
