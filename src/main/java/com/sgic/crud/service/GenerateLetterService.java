package com.sgic.crud.service;

import java.util.List;

import com.sgic.crud.entity.GenerateLetter;

public interface GenerateLetterService {

	public List<GenerateLetter> getGenerateLetter();
	public void createGenerateLetter(GenerateLetter generateLetter);
	boolean updateGenerateLetter(GenerateLetter generateLetter, Integer id);
	public void deleteGenerateLetter(Integer id);

}
