package com.example.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.site.common.CommonConst;

@Controller
@RequestMapping
public class HomePageController {

	/**
	 * トップページ
	 */
	@GetMapping
	public String showTopPage() {
		return CommonConst.TOP;
	}
	
	/**
	 * 会社情報ページ
	 */
	@GetMapping(CommonConst.COMPANY)
	public String showCompanyInfo() {
		return CommonConst.COMPANY;
	}
	
	/**
	 * サービスページ
	 */
	@GetMapping(CommonConst.SERVICE)
	public String showService() {
		return CommonConst.SERVICE;
	}
	
	/**
	 * 求人ページ
	 */
	@GetMapping(CommonConst.RECRUIT)
	public String showRecruit() {
		return CommonConst.RECRUIT;
	}
	
	/**
	 * 問い合わせページ
	 */
	@GetMapping(CommonConst.CONTACT)
	public String showContact() {
		return CommonConst.CONTACT;
	}
}
