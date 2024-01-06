package com.example.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.site.common.CommonConst;
import com.example.site.form.ContactForm;

import jakarta.validation.Valid;

@Controller
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
	public String showContact(@ModelAttribute ContactForm form, Model model) {
		return CommonConst.CONTACT;
	}
	
	/**
	 * 問い合わせ内容
	 */
	@PostMapping(CommonConst.CONTACT)
	public String getContact(@Valid ContactForm form, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			return CommonConst.CONTACT;
		}
		// メッセージセット
		model.addAttribute("infoMessage", "送信完了しました");
		return CommonConst.TOP;
	}
}
