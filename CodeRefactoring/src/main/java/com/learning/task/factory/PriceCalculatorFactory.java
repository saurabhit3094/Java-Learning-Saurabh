package com.learning.task.factory;

import com.learning.task.calculator.ChildrenBookPriceCalculator;
import com.learning.task.calculator.FictionBookPriceCalculator;
import com.learning.task.calculator.NonFictionBookPriceCalculator;
import com.learning.task.calculator.PricingCalculator;
import com.learning.task.util.BookCategory;

public class PriceCalculatorFactory {

    public static PricingCalculator getPriceCalulator(BookCategory bookCategory){

        switch (bookCategory){
            case FICTION:
                return new FictionBookPriceCalculator();
            case NON_FICTION:
                return new NonFictionBookPriceCalculator();
            case CHILDRENS:
                return new ChildrenBookPriceCalculator();
        }

        return null;
    }

}
