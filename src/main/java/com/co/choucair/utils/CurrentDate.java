package com.co.choucair.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(new Date());
    }
}
