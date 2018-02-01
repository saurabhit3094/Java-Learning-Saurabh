/**
 * 
 */
package com.learning.task.entity;

import com.learning.task.util.BookCategory;

import java.io.Serializable;
import java.util.Date;

/**
 * Movie : Simple data class representing movie data.
 * 
 * @author chandrashekarv
 *
 */
public class Book implements Serializable {

	private static final long serialVersionUID = -7348792584072115788L;

	private Date releaseDate;

	
	private long id;
	private String title;
	private BookCategory bookCategory;

	public Book(final String title, final BookCategory bookCategory) {
		super();
		this.title = title;
		this.bookCategory = bookCategory;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}


}
