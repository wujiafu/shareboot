package com.codelete.shareboot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.codelete.shareboot.vo.Dept;

public interface IDeptService {
	@Transactional(readOnly = true)
	public List<Dept> list();
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean add(Dept vo);
}