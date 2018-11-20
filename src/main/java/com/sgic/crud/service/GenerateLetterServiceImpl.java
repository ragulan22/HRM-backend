package com.sgic.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.crud.entity.GenerateLetter;
import com.sgic.crud.repository.GenerateLetterRepository;

@Service
public class GenerateLetterServiceImpl implements GenerateLetterService{

	@Autowired
	private GenerateLetterRepository generateLetterRepository;
	
	@Override
	public List<GenerateLetter> getGenerateLetter() {
		// TODO Auto-generated method stub
		return generateLetterRepository.findAll();
	}

	@Override
	public void createGenerateLetter(GenerateLetter generateLetter) {
		// TODO Auto-generated method stub
		generateLetterRepository.save(generateLetter);
		
	}

	@Override
	public boolean updateGenerateLetter(GenerateLetter generateLetter, Integer id) {
	
		if (generateLetterRepository.getOne(id) != null) {
			generateLetter.setId(id);
			generateLetterRepository.save(generateLetter);
			return true;
		}
		return false;

	}

	@Override
	public void deleteGenerateLetter(Integer id) {
		// TODO Auto-generated method stub
		generateLetterRepository.deleteById(id);
		
	}

}
