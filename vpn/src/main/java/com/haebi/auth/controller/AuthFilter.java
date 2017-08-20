package com.haebi.auth.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.haebi.config.URL;

@WebFilter(URL.AUTH_AUTHFILTER)
public class AuthFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        /* () or true : �������� �ʴ� ���� ���� 
         * false : �������� �ʴ� ���ǿ� ���� null ��ȯ
         * */
        //HttpSession session = request.getSession(false);
        HttpSession session = request.getSession();
        
        // ���������� id �� �ִ��� �˻�
        if (session.getAttribute("id") != null)
        {
        	System.out.println("AuthFilter - Ok");
        	
        	// ���ǿ� ����� ���, ���� ���͸� ȣ���Ѵ�. (�߰� ���Ͱ� ���� ��� ��û�� �޴³��� �����Ѵ�)
        	chain.doFilter(request, response);
        }
        else
        {
        	System.out.println("AuthFilter - Fail");
        	
        	// �α��� ȭ������ ���� ��ȯ
        	response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
        }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
