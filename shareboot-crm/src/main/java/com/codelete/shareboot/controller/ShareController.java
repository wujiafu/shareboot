package com.codelete.shareboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShareController {
	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping(value= {"/","index"})
	public String index() {
		return "redirect:druid";
	}
}
