package com.learning.task.calculator;

import com.learning.task.entity.Rental;

public class NonFictionBookPriceCalculator implements PricingCalculator {
    private final double basePrice = 3;
    private final double multiplier = 0;
    private final int multiplierThreshold = 0;

    public Double fetchBookPrice(Rental rental) {
        double thisAmount = basePrice;
        if (rental.getDaysRented() > multiplierThreshold)
            thisAmount += (rental.getDaysRented() - multiplierThreshold) * multiplier;
        return thisAmount;
    }
}
