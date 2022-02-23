package com.riddik.MagicCardApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardId;
	@Column(name= "card_no")
	private String cardNo;
	@Column(name= "price")
	private int price;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int cardId, String cardNo, int price) {
		super();
		this.cardId = cardId;
		this.cardNo = cardNo;
		this.price = price;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardNo=" + cardNo + ", price=" + price + "]";
	}
	

}
