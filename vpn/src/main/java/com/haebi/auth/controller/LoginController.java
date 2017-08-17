package com.haebi.auth.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.haebi.auth.service.AuthService;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7753965989577474315L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doGet");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println(id + " / " + pw);

		// �α��� ����!
		AuthService as = new AuthService();
		
		if(as.IsAuth(id, pw))
		{
			// �α��� ����. ���� ����.
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			// �α��� ���� �� ������ �����̷���
			//request.getRequestDispatcher("/WEB-INF/view/vpn/mypage.jsp").forward(request, response);
			response.sendRedirect("mypage");	// ����ó�� �̵��ϸ� ����� �ּҰ� �ٲ��� �ʴ´�.
		}
		else
		{
			// �α��� ����.
			HttpSession session = request.getSession();
			session.invalidate();
			
			// �α��� �������� ����
			response.sendRedirect("index.jsp");
		}
	}
}
