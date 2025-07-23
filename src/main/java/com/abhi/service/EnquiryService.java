package com.abhi.service;

import java.util.List;

import com.abhi.dto.DashboardResponseDTO;
import com.abhi.dto.EnqFilterDTO;
import com.abhi.dto.EnquiryDTO;

public interface EnquiryService {

	public DashboardResponseDTO getDashboardInfo(Integer counsellorId);

	public boolean addEnquiry(EnquiryDTO enqDTO, Integer counsellorId);

	public List<EnquiryDTO> getEnquiries(Integer counsellorId);

	public List<EnquiryDTO> getEnquiries(EnqFilterDTO filterDTO, Integer counsellorId);

	public EnquiryDTO getEnquiryById(Integer enqId);
}
