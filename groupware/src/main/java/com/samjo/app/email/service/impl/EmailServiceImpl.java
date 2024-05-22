package com.samjo.app.email.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samjo.app.common.service.SearchVO;
import com.samjo.app.email.mapper.EmailMapper;
import com.samjo.app.email.service.EmailFileVO;
import com.samjo.app.email.service.EmailService;
import com.samjo.app.email.service.EmailVO;
import com.samjo.app.emp.service.EmpVO;

@Service
public class EmailServiceImpl implements EmailService {
	
	EmailMapper emailMapper;
	
	
	
	@Autowired
	public EmailServiceImpl(EmailMapper emailMapper) {
		this.emailMapper = emailMapper;
	}
	
	//받은메일함 전체조회
	@Override
	public List<EmailVO> inboxList(SearchVO searchVO) {
		return emailMapper.selectInboxAll();
	}

	//받은메일함 단건조회
	@Override
	public EmailVO inboxInfo(EmailVO emailVO) {
		return emailMapper.selectInbox(emailVO);
	}
	
	//메일 발송
	@Override
	public int emailInsert(EmailVO emailVO) {
		return emailMapper.insertEmail(emailVO);
	}
	
	@Override
	public List<EmpVO> getEmpList(EmpVO empVO) {
		return emailMapper.getEmpList(empVO);
	}
	
	//메일 첨부파일
	@Override
	public int EmailFileInsert(EmailFileVO emailFileVO) {
		return emailMapper.insertEmailFile(emailFileVO);
	}
	
	//보낸메일함 전체조회
	@Override
	public List<EmailVO> emailList() {
		return emailMapper.selectEmailAll();
	}

	//보낸메일함 단건조회
	@Override
	public EmailVO emailInfo(EmailVO emailVO) {
		return emailMapper.selectEmail(emailVO);
	}

	//메일 휴지통 이동(상태 칼럼값 변경)
	@Override
	public EmailVO deleteEmail(EmailVO emailVO) {
		return emailMapper.deleteEmail(emailVO);
	}

	// 답신할 대상의 메일정보(수신메일)를 가져오기(체인메일넘버 유념)
	@Override
	public EmailVO getInboxNo(EmailVO emailVO) {
		return emailMapper.getInboxNo(emailVO);
	}

	//주고받은메일리스트 조회
	@Override
	public List<EmailVO> chainMailList() {
		return emailMapper.chainMailList();
	}

	//발신메일에 파일 첨부 파일 업로드와 다운로드는 COMMON에서 처리할 듯 하다. 
	//서비스 로직 구현을 여기에서 하지 않을 가능성이 크다는 소리다. 일단 건들지말고 두자.
	@Override
	public EmailVO setFile(EmailVO emailVO) {
		return null;
	}

	//수신메일에서 파일 다운로드
	@Override
	public EmailVO getFile(EmailVO emailVO) {
		return null;
	}

	@Override
	public int count() {
		return emailMapper.count();
	}

	@Override
	public int countSend() {
		return emailMapper.countSend();
	}

	@Override
	public List<EmailVO> wastedList() {
		
		
		return emailMapper.wastedList();
	}

	@Override
	public int countWasted() {
		return emailMapper.countWasted();
	}

	@Override
	public List<EmailVO> restoreMail() {
		return emailMapper.restoreMail();
	}




	

}
