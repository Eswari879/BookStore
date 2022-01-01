package com.bookstoremanagement.order.entities;

	import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
	
	@Entity
	public class Book {
		
		@Id
		private int bookId;
		private String title;
		private String author;
		@OneToOne(cascade=CascadeType.ALL)
		private Category category;
		private String description;
		private String isbn;
		private double price;
		private LocalDate publishDate;
		private LocalDate lastUpdatedOn;
		public int getBookId() {
			return bookId;
		}
		
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public LocalDate getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(LocalDate publishDate) {
			this.publishDate = publishDate;
		}
		public LocalDate getLastUpdatedOn() {
			return lastUpdatedOn;
		}
		public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
			this.lastUpdatedOn = lastUpdatedOn;
		}
		public Book(int bookId, String title, String author, Category category, String description, String isbn,
				double price, LocalDate publishDate, LocalDate lastUpdatedOn) {
			super();
			this.bookId = bookId;
			this.title = title;
			this.author = author;
			this.category = category;
			this.description = description;
			this.isbn = isbn;
			this.price = price;
			this.publishDate = publishDate;
			this.lastUpdatedOn = lastUpdatedOn;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
					+ ", isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", lastUpdatedOn="
					+ lastUpdatedOn + "]";
		}
		
		
	
}
