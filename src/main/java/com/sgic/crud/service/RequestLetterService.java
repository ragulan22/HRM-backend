package com.sgic.crud.service;

import java.util.List;

import com.sgic.crud.entity.RequestLetter;

public interface RequestLetterService {

	public List<RequestLetter> getRequestLetter();
	public void createRequestLetter(RequestLetter requesteLetter);
	boolean updateRequestLetter(RequestLetter requestLetter, Integer id);
	public void deleteRequestLetter(Integer id);

}
