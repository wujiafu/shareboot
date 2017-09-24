package com.codelete.shareboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.codelete.shareboot.vo.Dept;
@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
	public boolean doCreate(Dept vo) ;
}
