package com.haebi.vpn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haebi.config.URL;

@WebServlet(URL.MYPAGE_CTRL)
public class MyPageController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7241242462496522736L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doGet");
		
		// ���� ���� �� ����
		String strMsg = "HaHaHa";
		
		// ������ ��Ƽ�
		request.setAttribute("message", strMsg);
		
		// ������ �信 �Ǿ� ������
		request.getRequestDispatcher("/WEB-INF/view/vpn/mypage.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost");
	}
}
