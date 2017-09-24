package com.codelete.shareboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.codelete.shareboot.dao.IDeptDAO;
import com.codelete.shareboot.service.IDeptService;
import com.codelete.shareboot.vo.Dept;

public class IDeptServiceImpl implements IDeptService {

	@Resource
	private IDeptDAO deptDAO;

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
	}

	@Override
	public boolean add(Dept vo) {
		return this.deptDAO.doCreate(vo);
	}
}
