package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.userinterfaces.AutocompletePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.AutocompletePage.AUTOCOMPLETE_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOutTheForm implements Task {

    private UserLoombokData user;

    public FillOutTheForm(UserLoombokData user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AUTOCOMPLETE_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AUTOCOMPLETE_FIELD),
                Click.on(AutocompletePage.ADDRESS_FIELD),
                Enter.theValue(user.getAddress()).into(AutocompletePage.ADDRESS_FIELD) ,
                Click.on(AutocompletePage.CITY_FIELD),
                Enter.theValue(user.getCity()).into(AutocompletePage.CITY_FIELD),
                Click.on(AutocompletePage.STATE_FIELD),
                Enter.theValue(user.getState()).into(AutocompletePage.STATE_FIELD),
                Click.on(AutocompletePage.ZIP_CODE_FIELD),
                Enter.theValue(user.getZip()).into(AutocompletePage.ZIP_CODE_FIELD),
                Click.on(AutocompletePage.COUNTRY_FIELD),
                Enter.theValue(user.getCountry()).into(AutocompletePage.COUNTRY_FIELD)

        );
    }

    public static FillOutTheForm on(UserLoombokData user){
        return Instrumented.instanceOf(FillOutTheForm.class).withProperties(user);
    }

}
