package com.haebi.auth.service;

public class AuthService {
	
	// ���� ����. ��� ����.
	// ���� : True
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
