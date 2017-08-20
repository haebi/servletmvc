package com.haebi.auth.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.haebi.auth.service.AuthService;
import com.haebi.config.URL;

@WebServlet(URL.AUTH_LOGINCTRL)
public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7753965989577474315L;
	
	// �ν��Ͻ� ����
	AuthService as = new AuthService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doGet - LoginController");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//System.out.println(id + " / " + pw);

		// �α��� ����!
		if(as.IsAuth(id, pw))
		{
			System.out.println("auth ok - add seddion : id");
			
			// �α��� ����. ���� ����.
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			// �α��� ���� �� ������ �����̷���
			// ����ó�� �̵��ϸ� ����� �ּҰ� �ٲ��� �ʴ´�.
			//request.getRequestDispatcher("/WEB-INF/view/vpn/mypage.jsp").forward(request, response);
			//response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
		}
		else
		{
			System.out.println("auth fail - session clear");
			
			// �α��� ����.
			HttpSession session = request.getSession();
			session.invalidate();
		}
		
		response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
	}
}
