package com.haebi.auth.dao;

public class AuthDao {

	public boolean IsAuth(String id, String pw)
	{
		// DB���� ó���� ���߿� ����
		if ("qqq".equals(id) && "www".equals(pw)) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
