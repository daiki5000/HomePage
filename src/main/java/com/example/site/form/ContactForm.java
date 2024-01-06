package com.example.site.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactForm {

	@NotBlank(message = "氏名を入力してください")
	private String name;
	@Email(message = "メールアドレス形式で入力してください")
	private String mail;
	@NotBlank(message = "題名を入力してください")
	private String title;
	@NotBlank(message = "内容を入力してください")
	private String content;
	
	private String tel;
}
