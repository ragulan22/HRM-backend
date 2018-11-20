package com.sgic.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.crud.entity.RejectReason;

public interface RejectReasonRepository extends JpaRepository<RejectReason, Integer> {

}
