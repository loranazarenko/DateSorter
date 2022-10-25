package com.testwork.datesorter.sorters.impl;

import com.testwork.datesorter.sorters.IDateSorter;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The Date sorter class, runs the single method
 * what manages the union of filtered and sorted collections.
 */
public class DateSorter implements IDateSorter {
    /**
     * The method sorts of dates used the filter with 'r'.
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        //list dates with 'r'
        List<LocalDate> datesMonthsWithR = new ArrayList<>();
        //list dates without 'r'
        List<LocalDate> datesMonthsWithoutR = new ArrayList<>();
        //loop through the list of dates
        for (LocalDate date : unsortedDates) {
            //get name of the month
            Month month = date.getMonth();
            //finding the letter p in the name of the month, in lowercase
            if (month.name().toLowerCase().contains("r")) {
                datesMonthsWithR.add(date);
            } else {
                datesMonthsWithoutR.add(date);
            }
        }
        //sorting of the list with 'r'
        Collections.sort(datesMonthsWithR);
        //sorting of the list without 'r'
        Collections.sort(datesMonthsWithoutR, Collections.reverseOrder());
        //list merging
        datesMonthsWithR.addAll(datesMonthsWithoutR);

        return datesMonthsWithR;
    }
}
