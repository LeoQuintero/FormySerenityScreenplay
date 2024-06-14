package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.AutocompletePage;
import com.co.choucair.userinterfaces.DatepickerPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateTo implements Task {
    public static NavigateTo datepickerpage(){
        return Instrumented.instanceOf(NavigateTo.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(DatepickerPage.DATEPICKER_FIELD)
        );

    }
}
