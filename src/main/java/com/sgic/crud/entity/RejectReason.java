package com.sgic.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class RejectReason {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	Integer id;
	
	@OneToOne
	@JoinColumn(name="RequestLetterId")
	RequestLetter requestLetterId;
	
	@Column(name="RejectReason")
	String rejectReason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RequestLetter getRequestLetterId() {
		return requestLetterId;
	}

	public void setRequestLetterId(RequestLetter requestLetterId) {
		this.requestLetterId = requestLetterId;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	
	
	

}
