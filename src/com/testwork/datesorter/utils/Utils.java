package com.testwork.datesorter.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that contains helper methods
 * for working with strings and dates
 */
public class Utils {
    /**
     * This method should parse the list of strings,
     * converting it to a list of dates.
     *
     * @param dateString string for parsing
     * @return list of dates
     */
    public static List<LocalDate> parseFromStringToDate(List<String> dateString) {
        List<LocalDate> localDates = new ArrayList<>();
        //loop through the list of strings and get date from string
        for (String string : dateString) {
            LocalDate date = LocalDate.parse(string);
            localDates.add(date);
        }
        return localDates;
    }
}
