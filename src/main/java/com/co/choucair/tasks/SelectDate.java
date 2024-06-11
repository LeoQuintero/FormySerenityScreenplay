package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.DatepickerPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.AutocompletePage.AUTOCOMPLETE_FIELD;
import static com.co.choucair.userinterfaces.DatepickerPage.DATEPICKER_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectDate implements Task  {
    private String date;

    public SelectDate(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DATEPICKER_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DATEPICKER_FIELD),
                WaitUntil.the(DatepickerPage.DATEPICKER_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DatepickerPage.DATEPICKER_INPUT),  // Hacer clic en el campo de entrada
                Click.on(DatepickerPage.getDateElement(date))
        );
    }
    public static SelectDate fromCalendar(String date) {
        return Instrumented.instanceOf(SelectDate.class).withProperties(date);
    }
}
