package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.DatepickerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.choucair.userinterfaces.DatepickerPage.DATEPICKER_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterInvalidDate implements Task {
    private String date;

    public EnterInvalidDate(String date) {
        this.date = date;
    }

    public static EnterInvalidDate withFormat(String date) {
        return Tasks.instrumented(EnterInvalidDate.class, date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DATEPICKER_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DATEPICKER_FIELD),
                Task.where("{0} enters an incorrect date format",
                        Enter.theValue(date)
                                .into(DatepickerPage.DATEPICKER_INPUT)
                                .thenHit(Keys.ENTER)
                )
        );
    }
}
