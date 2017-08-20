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
	
	// 인스턴스 생성
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

		// 로그인 인증!
		if(as.IsAuth(id, pw))
		{
			System.out.println("auth ok - add seddion : id");
			
			// 로그인 성공. 세션 설정.
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			// 로그인 성공 시 페이지 리다이렉션
			// 디스패처로 이동하면 상단의 주소가 바뀌지 않는다.
			//request.getRequestDispatcher("/WEB-INF/view/vpn/mypage.jsp").forward(request, response);
			//response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
		}
		else
		{
			System.out.println("auth fail - session clear");
			
			// 로그인 실패.
			HttpSession session = request.getSession();
			session.invalidate();
		}
		
		response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
	}
}
