package com.codelete.shareboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.codelete.shareboot.vo.Member;

@Mapper 
public interface IMemberDAO {
	public Member findById(String mid) ;
}
