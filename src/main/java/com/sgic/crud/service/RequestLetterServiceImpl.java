package com.sgic.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.crud.entity.RequestLetter;
import com.sgic.crud.repository.RequestLetterRepository;

@Service
public class RequestLetterServiceImpl implements RequestLetterService {

	@Autowired
	private RequestLetterRepository requestLetterRepository;
	
	@Override
	public List<RequestLetter> getRequestLetter() {
		// TODO Auto-generated method stub
		return requestLetterRepository.findAll();
	}

	@Override
	public void createRequestLetter(RequestLetter requesteLetter) {
		// TODO Auto-generated method stub
		requestLetterRepository.save(requesteLetter);
		
	}

	@Override
	public boolean updateRequestLetter(RequestLetter requestLetter, Integer id) {
		// TODO Auto-generated method stub
		if (requestLetterRepository.getOne(id) != null) {
			requestLetter.setId(id);
			requestLetterRepository.save(requestLetter);
			return true;
		}
		return false;	
		
	}

	@Override
	public void deleteRequestLetter(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
