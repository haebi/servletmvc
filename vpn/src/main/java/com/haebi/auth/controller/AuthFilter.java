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
        
        /* () or true : 존재하지 않는 세션 생성 
         * false : 존재하지 않는 세션에 대해 null 반환
         * */
        //HttpSession session = request.getSession(false);
        HttpSession session = request.getSession();
        
        // 세션정보에 id 가 있는지 검사
        if (session.getAttribute("id") != null)
        {
        	System.out.println("AuthFilter - Ok");
        	
        	// 조건에 통과한 경우, 다음 필터를 호출한다. (추가 필터가 없는 경우 요청을 받는놈이 동작한다)
        	chain.doFilter(request, response);
        }
        else
        {
        	System.out.println("AuthFilter - Fail");
        	
        	// 로그인 화면으로 강제 송환
        	response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
        }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
