package com.haebi.auth.service;

public class AuthService {
	
	// 인증 수행. 결과 리턴.
	// 성공 : True
	public boolean IsAuth(String id, String pw)
	{
		// DB연결 처리는 나중에 구현
		if ("qqq".equals(id) && "www".equals(pw)) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
