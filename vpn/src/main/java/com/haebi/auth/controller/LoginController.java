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

		// 로그인 인증!
		AuthService as = new AuthService();
		
		if(as.IsAuth(id, pw))
		{
			// 로그인 성공. 세션 설정.
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			// 로그인 성공 시 페이지 리다이렉션
			//request.getRequestDispatcher("/WEB-INF/view/vpn/mypage.jsp").forward(request, response);
			response.sendRedirect("mypage");	// 디스패처로 이동하면 상단의 주소가 바뀌지 않는다.
		}
		else
		{
			// 로그인 실패.
			HttpSession session = request.getSession();
			session.invalidate();
			
			// 로그인 페이지로 리턴
			response.sendRedirect("index.jsp");
		}
	}
}
