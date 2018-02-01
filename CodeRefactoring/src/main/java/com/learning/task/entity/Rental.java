
package com.learning.task.entity;

import com.learning.task.util.BookCategory;
import com.learning.task.calculator.PricingCalculator;
import com.learning.task.factory.PriceCalculatorFactory;

import java.io.Serializable;

/**
 * Represent a customer renting a book.
 * 
 * @author chandrashekarv
 *
 */
public class Rental implements Serializable {

	private static final long serialVersionUID = 1256869448913370768L;

	private Book book;

	private int daysRented;

	public Rental(Book book, int daysRented) {
		super();
		this.book = book;
		this.daysRented = daysRented;
	}
	
	public int getFrequentRenterPoint(int frequentRenterPoints) {
		if ((this.getBook().getBookCategory() == BookCategory.FICTION) && this.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
	
	public double fetchRentals() {
		PricingCalculator calculator =  PriceCalculatorFactory.getPriceCalulator(this.book.getBookCategory());
		return  calculator.fetchBookPrice(this);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	
}
