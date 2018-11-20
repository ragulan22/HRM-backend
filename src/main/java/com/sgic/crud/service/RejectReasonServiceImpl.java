package com.sgic.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.crud.entity.RejectReason;
import com.sgic.crud.repository.RejectReasonRepository;

@Service
public class RejectReasonServiceImpl implements RejectReasonService {

	@Autowired
	private RejectReasonRepository rejectReasonRepository;
	
	@Override
	public List<RejectReason> getRejectReason() {
		// TODO Auto-generated method stub
		return rejectReasonRepository.findAll();
	}

	@Override
	public void createRejectReason(RejectReason rejectReason) {
		// TODO Auto-generated method stub
		rejectReasonRepository.save(rejectReason);
		
	}

	@Override
	public boolean updateRejectReason(RejectReason rejectReason, Integer id) {
		// TODO Auto-generated method stub
		if (rejectReasonRepository.getOne(id) != null) {
			rejectReason.setId(id);
			rejectReasonRepository.save(rejectReason);
			return true;
		}
		return false;		
	}

	@Override
	public void deleteRejectReason(Integer id) {
		// TODO Auto-generated method stub
		rejectReasonRepository.deleteById(id);
		
	}

}
