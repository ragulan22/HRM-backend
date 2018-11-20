package com.sgic.crud.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class GenerateLetter {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	Integer id;
	
	@OneToOne
	@JoinColumn(name="UserId")
	User userId;
	
	@OneToOne
	@JoinColumn(name="RequestLetterId")
	RequestLetter requestLetterId;
	
	@Column(name="ExperienceLetter")
	String experienceLetter;
	
	@DateTimeFormat(pattern="dd/mm/yyyy")
	@Column(name="CetatedAt")
	LocalDate createdAt;
	
	@Column(name="Status")
	String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public RequestLetter getRequestLetterId() {
		return requestLetterId;
	}

	public void setRequestLetterId(RequestLetter requestLetterId) {
		this.requestLetterId = requestLetterId;
	}

	public String getExperienceLetter() {
		return experienceLetter;
	}

	public void setExperienceLetter(String experienceLetter) {
		this.experienceLetter = experienceLetter;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
