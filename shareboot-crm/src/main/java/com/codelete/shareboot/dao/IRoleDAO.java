package com.codelete.shareboot.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRoleDAO {
	public Set<String> findAllRoleByMember(String mid) ; 
}
