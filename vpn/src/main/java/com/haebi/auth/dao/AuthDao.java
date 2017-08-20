package com.haebi.auth.dao;

public class AuthDao {

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
