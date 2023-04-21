package com.hdfc.project.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Document(collection="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private long cartId;
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL )
	@JsonManagedReference
	private Set<CartItem> items=new HashSet<>();
	@OneToOne
	private Customer customer;
	@Column(name="Bill_Amount")
	private double billAmount;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long cartId, Set<com.hdfc.project.entity.CartItem> items, com.hdfc.project.entity.Customer customer,
			double billAmount) {
		super();
		this.cartId = cartId;
		this.items = items;
		this.customer = customer;
		this.billAmount = billAmount;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public Set<CartItem> getItems() {
		return items;
	}

	public void setItems(Set<CartItem> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", items=" + items + ", customer=" + customer + ", billAmount=" + billAmount
				+ "]";
	}
	
	
	


}
