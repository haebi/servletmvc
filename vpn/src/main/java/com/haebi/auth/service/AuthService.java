package com.haebi.auth.service;

import com.haebi.auth.dao.AuthDao;

public class AuthService {
	
	AuthDao authDao = new AuthDao();
	
	// ���� ����. ��� ����.
	// ���� : True
	public boolean IsAuth(String id, String pw)
	{
		return authDao.IsAuth(id, pw);
	}
}
