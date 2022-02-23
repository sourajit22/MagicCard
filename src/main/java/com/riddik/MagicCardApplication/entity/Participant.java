package com.riddik.MagicCardApplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "participants")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int participantId;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "mail_id")
	private String mailId;
	@Column(name = "contact_no")
	private long contactNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "card_id")
	private Card card;
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Participant(int participantId, String name, int age, String mailId, long contactNo, Card card) {
		super();
		this.participantId = participantId;
		this.name = name;
		this.age = age;
		this.mailId = mailId;
		this.contactNo = contactNo;
		this.card = card;
	}

	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Participant [participantId=" + participantId + ", name=" + name + ", age=" + age + ", mailId=" + mailId
				+ ", contactNo=" + contactNo + ", card=" + card + "]";
	}
	
	

}
