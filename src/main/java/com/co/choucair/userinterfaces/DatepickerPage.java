package com.co.choucair.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DatepickerPage {
    public static final Target DATEPICKER_FIELD = Target.the("Datepicker field")
            .located(By.xpath("(//*/a[contains(@class,\"btn btn-lg\")])[4]"));
    public static final Target DATEPICKER_INPUT = Target.the("datepicker input")
            .located(By.id("datepicker"));
    public static final Target CALENDAR = Target.the("calendar")
            .located(By.className("datepicker-days"));

    public static Target getDateElement(String date) {
        // Suponiendo que el formato de la fecha es mm-dd-yyyy
        String[] parts = date.split("-");
        String day = parts[1];
        return Target.the("day " + day)
                .located(By.xpath("//td[@class='day' and text()='" + Integer.parseInt(day) + "']"));
    }
}
