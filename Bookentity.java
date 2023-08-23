package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bookentity {
	
	@Id
	@GeneratedValue
	private int id;
	private String bookName;
	private float price;
	private int quantity;
	private String authourName;
	public Bookentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookentity(int id, String bookName, float price, int quantity, String authourName) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
		this.authourName = authourName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthourName() {
		return authourName;
	}
	public void setAuthourName(String authourName) {
		this.authourName = authourName;
	}
	
  
}
