package com.sgic.crud.service;

import java.util.List;

import com.sgic.crud.entity.RejectReason;



public interface RejectReasonService {
	public List<RejectReason> getRejectReason();
	public void createRejectReason(RejectReason rejectReason);
	boolean updateRejectReason(RejectReason rejectReason, Integer id);
	public void deleteRejectReason(Integer id);

}
