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

import com.sgic.crud.entity.RejectReason;
import com.sgic.crud.service.RejectReasonService;

@RestController
public class RejectReasonController {
	@Autowired
	private RejectReasonService rejectReasonService;
	
	@GetMapping("/reject-reason")
	public List<RejectReason> getRejecReason(){
		return rejectReasonService.getRejectReason();
	} 
	

	@PostMapping("/reject-reason")
	public void postRejectReason(@RequestBody RejectReason rejectReason) {
		rejectReasonService.createRejectReason(rejectReason);
	}
	

	@PutMapping("/reject-reason/{Id}")
	public void editRejectReason(@RequestBody RejectReason rejectReason,@PathVariable Integer Id) {
		rejectReasonService.updateRejectReason(rejectReason, Id);
	}
	@DeleteMapping("/reject-reason/{Id}")
	public void deleteRejectReason(@PathVariable Integer Id) {
		rejectReasonService.deleteRejectReason(Id);
	}
}
