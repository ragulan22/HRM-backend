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

import com.sgic.crud.entity.RequestLetter;
import com.sgic.crud.service.RequestLetterService;

@RestController
public class RequestLetterController {
	@Autowired
	private RequestLetterService requestLetterService;
	
	@GetMapping("/request-letter")
	public List<RequestLetter> getGenerateLetter(){
		return requestLetterService.getRequestLetter();
	} 

	@PostMapping("/request-letter")
	public void postRequestLetter(@RequestBody RequestLetter requestLetter) {
		requestLetterService.createRequestLetter(requestLetter);
	}
	

	@PutMapping("/request-letter/{Id}")
	public void editRequestLetter(@RequestBody RequestLetter requestLetter,@PathVariable Integer Id) {
		requestLetterService.updateRequestLetter(requestLetter, Id);
	}
	@DeleteMapping("/request-letter/{Id}")
	public void deleteGenerateLetter(@PathVariable Integer Id) {
		requestLetterService.deleteRequestLetter(Id);
	}


}
