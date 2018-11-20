package com.sgic.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.crud.entity.GenerateLetter;
import com.sgic.crud.service.GenerateLetterService;

@RestController
public class GenerateLetterController {
	@Autowired
	private GenerateLetterService generateLetterService;
	
	@GetMapping("/generate-letter")
	public List<GenerateLetter> getGenerateLetter(){
		return generateLetterService.getGenerateLetter();
	} 
	

	@PostMapping("/generate-letter")
	public void postRejectReason(@RequestBody GenerateLetter generateLetter) {
		generateLetterService.createGenerateLetter(generateLetter);;
	}
	

	@PutMapping("/generate-letter/{Id}")
	public void editGenerateLetter(@RequestBody GenerateLetter generateLetter,@PathVariable Integer Id) {
		generateLetterService.updateGenerateLetter(generateLetter, Id);;
	}
	@DeleteMapping("/generate-letter/{Id}")
	public void deleteGenerateLetter(@PathVariable Integer Id) {
		generateLetterService.deleteGenerateLetter(Id);
	}

}
