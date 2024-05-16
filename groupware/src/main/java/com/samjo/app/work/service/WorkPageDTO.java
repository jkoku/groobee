package com.samjo.app.work.service;

import java.util.Date;

import lombok.Data;

@Data
public class WorkPageDTO {
	private int page;
	private int startPage, endPage;
	private boolean prev, next;
	
	private String wk_yn, wk_stat, wk_site;
	
	private Date oneDate, twoDate;
	
	
	public WorkPageDTO (int page, int totalCnt) {
		this.page = page;
		int realEnd = (int) Math.ceil(totalCnt/5.0);
		
		this.endPage = (int) Math.ceil(page/5.0) * 5;
		this.startPage = this.endPage -4;
		
		this.endPage = this.endPage > realEnd ? realEnd : this.endPage;
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
