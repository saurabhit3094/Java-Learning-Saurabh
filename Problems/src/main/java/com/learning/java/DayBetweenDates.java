package com.learning.java;

import java.util.Calendar;
import java.util.Date;

public class DayBetweenDates {

    private int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DayBetweenDates dayBetweenDates = new DayBetweenDates();

        //date 1 21/09/2001
        calendar.set(2001,9,21);
        int date1Days = dayBetweenDates.calculateDays(calendar);

        //date 2 20/02/2013
        calendar.set(2013,2,20);
        int date2Days = dayBetweenDates.calculateDays(calendar);

        System.out.println("Difference is : " + (date2Days - date1Days));

    }

    private int calculateDays(Calendar calendar){
            int year = calendar.get(Calendar.YEAR);
        System.out.println("year is : " + year);

        int days = (year * 365) + getDaysTillMonth(calendar.get(Calendar.MONTH)) + calendar.get(Calendar.DATE) + countleapYears(year,calendar.get(Calendar.MONTH));
        System.out.println("days are " + days);
        return days;
    }

    private int getDaysTillMonth(int month) {
        int days =0;
        for (int i=0;i<month-1;i++)
        days += daysInMonth[i];

        return 0;
    }

    private int countleapYears(int year,int month) {

        if (month <= 2){
            year--;
        }
        return (year/4)-(year/100)+(year/400);
    }


}
