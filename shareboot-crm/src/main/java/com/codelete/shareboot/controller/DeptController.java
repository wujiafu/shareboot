package com.codelete.shareboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codelete.shareboot.service.IDeptService;
import com.codelete.shareboot.util.controller.AbstractBaseController;

@Controller
public class DeptController extends AbstractBaseController {
	@Resource
	private IDeptService deptService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Object list() { // 通过model可以实现内容的传递
		return this.deptService.list();
	}

	@RequestMapping(value = "/dept", method = RequestMethod.GET)
	public String dept() { // 通过model可以实现内容的传递
		return "dept";
	}

}
