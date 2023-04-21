package com.hdfc.project.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Document
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartItemId;
	private int quantity;
	private double totalPrice;
	@ManyToOne
	@JsonBackReference
	private Cart cart;
	@OneToOne
	private Product product;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(long cartItemId, int quantity, double totalPrice, com.hdfc.project.entity.Cart cart,
			com.hdfc.project.entity.Product product) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.cart = cart;
		this.product = product;
	}

	public long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", cart=" + cart + ", product=" + product + "]";
	}
	
	
	
}



