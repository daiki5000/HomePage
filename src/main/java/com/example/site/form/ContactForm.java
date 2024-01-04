package com.example.site.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactForm {

	private String name;
	
	private String mail;
	
	private String title;
	
	private String content;
	
	private String tel;
}
