package com.learning.task.calculator;

import com.learning.task.entity.Rental;

public class FictionBookPriceCalculator implements PricingCalculator {

    private final double basePrice = 2;
    private final double multiplier = 1.5;
    private final int multiplierThreshold = 2;

    public Double fetchBookPrice(Rental rental) {
        double thisAmount = basePrice;
        if (rental.getDaysRented() > multiplierThreshold)
            thisAmount += (rental.getDaysRented() - multiplierThreshold) * multiplier;
        return thisAmount;
    }
}
