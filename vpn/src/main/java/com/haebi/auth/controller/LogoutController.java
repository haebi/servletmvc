package com.haebi.auth.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.haebi.config.URL;

@WebServlet(URL.AUTH_LOGOUTCTRL)
public class LogoutController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5987430538059580967L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doGet - LogoutController");
		
		logout(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost - LogoutController");
		
		logout(request, response);
	}
	
	private void logout(HttpServletRequest request, HttpServletResponse response) 
			throws IOException
	{
		// 세션 제거
		HttpSession session = request.getSession();
		session.invalidate();
		
		// 로그인 페이지로 리턴
		response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
	}
}
