package com.learning.task.client;

import com.learning.task.util.BookCategory;
import com.learning.task.entity.Book;
import com.learning.task.entity.Customer;
import com.learning.task.entity.Rental;

public class Client {
	public static void main(String[] args) {
		
		Customer customer = new Customer("Saurabh Tiwari");
		customer.addRental(new Rental(new Book("the Alchemist", BookCategory.FICTION), 5));
		customer.addRental(new Rental(new Book("NonFictionBook", BookCategory.NON_FICTION), 10));
		System.out.print(customer.fetchStatement());

	}

}
