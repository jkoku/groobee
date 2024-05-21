package com.samjo.app.email.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmailVO {
	
	// email TABLE
	private String senEmailNo;
	private String sender;
	private String title;
	private String cntn;
	private Date sentDt;
	private String emailStat;
	private String chainMailNo;
	private String custNo;
	
	// inbox TABLE
	private String recEmailNo;
	private String recp;
	private String refer;
	//private String recpType; //수신자,참조자 구별하는건데 이거 없애고 걍 참조자 필드 추가.
	private Date readDt;
	
	// email_file TABLE
	private Integer fileNo; // >> 다른 TABLE fileNo와 이름은 같으나, PRIMARY KEY이다. 여기서 다루는게 맞다
	private String saveName;
	private String uplName;
	private String fileExt;
	private String fileSize;
	private Date fileDt;
	private String uplEmp;
	
	
}

