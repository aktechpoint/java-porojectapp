package com.abhi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entitiy.EnquiryEntity;

public interface EnquiryRepo extends JpaRepository<EnquiryEntity, Integer> {

	public List<EnquiryEntity> findByCounsellorCounsellorId(Integer counsellorId);

}