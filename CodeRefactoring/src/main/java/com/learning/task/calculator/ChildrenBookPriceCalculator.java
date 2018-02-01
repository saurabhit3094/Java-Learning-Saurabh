package com.learning.task.calculator;

import com.learning.task.entity.Rental;

public class ChildrenBookPriceCalculator implements PricingCalculator {

    private final double basePrice = 1.5;
    private final double multiplier = 2;
    private final int multiplierThreshold = 3;

    public Double fetchBookPrice(Rental rental) {
        double thisAmount = basePrice;
        if (rental.getDaysRented() > multiplierThreshold)
            thisAmount += (rental.getDaysRented() - multiplierThreshold) * multiplier;
        return thisAmount;
    }
}
