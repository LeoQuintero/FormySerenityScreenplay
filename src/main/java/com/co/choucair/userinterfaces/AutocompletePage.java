package com.co.choucair.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AutocompletePage {
    public static final Target AUTOCOMPLETE_FIELD = Target.the("Autocomplete field")
            .located(By.xpath("(//*/a[contains(@class,\"btn btn-lg\")])[1]"));
    public static final Target ADDRESS_FIELD = Target.the("Address field").located(By.xpath("//*[@id=\"autocomplete\"]"));
    public static final Target CITY_FIELD = Target.the("City field").located(By.xpath("//*[@id=\"locality\"]"));
    public static final Target STATE_FIELD = Target.the("State field").located(By.id("administrative_area_level_1"));
    public static final Target ZIP_CODE_FIELD = Target.the("Zip Code field").located(By.id("postal_code"));
    public static final Target COUNTRY_FIELD = Target.the("Country field").located(By.id("country"));
//    public static final Target SUBMIT_BUTTON = Target.the("Submit button").located(By.id("submit-button"));
//    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message").located(By.id("confirmation-message"));

}
