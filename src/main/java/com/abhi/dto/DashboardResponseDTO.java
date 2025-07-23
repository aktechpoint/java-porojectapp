package com.abhi.dto;

import lombok.Data;

@Data
public class DashboardResponseDTO {
	
	private Integer totalEnqCnt;
	private Integer openEnqCnt;
	private Integer enrolledEnqCnt;
	private Integer lostEnqCnt;
	public Integer getTotalEnqCnt() {
		return totalEnqCnt;
	}
	public void setTotalEnqCnt(Integer totalEnqCnt) {
		this.totalEnqCnt = totalEnqCnt;
	}
	public Integer getOpenEnqCnt() {
		return openEnqCnt;
	}
	public void setOpenEnqCnt(Integer openEnqCnt) {
		this.openEnqCnt = openEnqCnt;
	}
	public Integer getEnrolledEnqCnt() {
		return enrolledEnqCnt;
	}
	public void setEnrolledEnqCnt(Integer enrolledEnqCnt) {
		this.enrolledEnqCnt = enrolledEnqCnt;
	}
	public Integer getLostEnqCnt() {
		return lostEnqCnt;
	}
	public void setLostEnqCnt(Integer lostEnqCnt) {
		this.lostEnqCnt = lostEnqCnt;
	}
	

}
