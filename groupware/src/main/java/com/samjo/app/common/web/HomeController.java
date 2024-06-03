package com.samjo.app.common.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	private HttpSession session;

	// 로그인 - 초기화면
	@GetMapping("/")
	public String BasicPage() {
		return "common/basic";
	}

	// 로그인 - 솔루션소개
	@GetMapping("/introduce")
	public String IntroducePage() {
		return "common/introduce";
	}

	// 로그인 페이지
		@GetMapping("/loginPage")
		public String loginPage(Model model) {
			return "common/login";
		}
	
	// 고객사 메인페이지
	@GetMapping("/home")
	public String HomePage(Model model) {
		if (session != null) {
			session.invalidate();
		}
		return "test/test";
	}

	// 솔루션 메인페이지
	@GetMapping("/solHome")
	public String SolHomePage(Model model) {

		if (session != null) {
			session.invalidate();
		}
		return "test/test";
	}
}
