package com.learning.task.calculator;

import com.learning.task.entity.Rental;

public interface PricingCalculator {
    public Double fetchBookPrice(Rental rental);
}
