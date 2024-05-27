package com.samjo.app.common.service;

import lombok.Data;

@Data
public class PageDTO {
	private int page; //현재페이지.
	private int startPage, endPage; // 현재 13이면 ->  << 11 12 13 14 15 ... 20 >>
	private boolean prev, next; // <<, >> 있는지 없는지.
	private int totalCnt;
	
	public PageDTO (int page, int totalCnt) {
		this.page = page;
		this.totalCnt = totalCnt;
		int realEnd = (int) Math.ceil(totalCnt/10.0);
		
		this.endPage = (int) Math.ceil(page/10.0) * 10;
		this.startPage = this.endPage - 9;
		
		this.endPage = this.endPage > realEnd ? realEnd : this.endPage;
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
