package com.learning.task.util;

import com.learning.task.entity.Rental;

public class CommonUtility {

    public static int getFrequentRenterPoint(int frequentRenterPoints, Rental rental){
        if ((rental.getBook().getBookCategory() == BookCategory.FICTION) && rental.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
