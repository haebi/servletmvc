package com.haebi.auth.service;

import com.haebi.auth.dao.AuthDao;

public class AuthService {
	
	AuthDao authDao = new AuthDao();
	
	// 인증 수행. 결과 리턴.
	// 성공 : True
	public boolean IsAuth(String id, String pw)
	{
		return authDao.IsAuth(id, pw);
	}
}
