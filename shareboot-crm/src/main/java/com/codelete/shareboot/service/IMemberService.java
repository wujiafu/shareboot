package com.codelete.shareboot.service;

import java.util.Map;
import java.util.Set;

import com.codelete.shareboot.vo.Member;

public interface IMemberService {
	public Member get(String mid) ;
	public Map<String,Set<String>> listAuthByMember(String mid) ;
}
