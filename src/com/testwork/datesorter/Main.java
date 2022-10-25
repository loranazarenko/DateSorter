package com.testwork.datesorter;

import com.testwork.datesorter.sorters.impl.DateSorter;
import com.testwork.datesorter.utils.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that is a point of enter the program,
 * what sorts a list of dates
 */
public class Main {

    public static void main(String[] args) {
        //initial data
        List<String> dateString = new ArrayList<>(List.of("2005-07-01", "2005-01-02", "2005-01-01", "2005-05-03"));
        List<LocalDate> localDates;
        //parsing strings to dates
        localDates = Utils.parseFromStringToDate(dateString);
        DateSorter dateSorter = new DateSorter();
        //sorting of dates
        localDates = (List<LocalDate>) dateSorter.sortDates(localDates);
        System.out.println("Sorted dates: " + localDates);
    }
}
