package com.co.choucair.questions;

import com.co.choucair.userinterfaces.DatepickerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.co.choucair.userinterfaces.DatepickerPage.DATEPICKER_INPUT;

public class IsEmptyOrCurrentDate implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // Retrieve the current value of the date picker input
        String actualValue = DatepickerPage.DATEPICKER_INPUT.resolveFor(actor).getValue();

        // Format the current date to match the expected format
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // Evaluate the validation condition
        return actualValue.isEmpty() || actualValue.equals(currentDate);
    }
    public static IsEmptyOrCurrentDate value() {
        return new IsEmptyOrCurrentDate();
    }
}
