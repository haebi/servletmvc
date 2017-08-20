/*
 * sendRedirect 호출 예
 * response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
 * 
 * BASE_ADDR 설정 안내
 * Tomcat 단독 이용 시 : "" 으로 설정합니다.
 * Nginx 프록시 이용 시 : Nginx 프록시 에 설정된 경로 를 입력합니다.
 * - 예) Nginx 프록시 설정이 /wa 로, /wa 하단의 모든 연결을 tomcat 으로 돌려놓은 경우,
 *      WAS 에서 인식하는 request.getContextPath() 가 /vpn 이라고 가정하면 실제 경로는 http://domain/wa/vpn 이 됩니다.
 *      그러나, request.getContextPath() 가 가져오는 경로는 tomcat 자신 기준으로 현재 위치를 구하여 http://domain/vpn 이 되어버립니다.
 *      이 문제를 해결하기 위해 BASE_ADDR을 더하여 이 차이를 보정합니다.
*/

package com.haebi.config;

import javax.servlet.http.HttpServletRequest;

public class URL {
	// 기본 주소
	public static final String BASE_ADDR			= "";	// tomcat 단독 이용시 "" 으로 설정합니다. | Nginx 프록시 이용 시 프록시 설정 경로를 입력합니다. "/wa"
	
	// 필터 설정
	public static final String AUTH_AUTHFILTER 		= "/auth/*";
	
	// 서블릿 설정
	public static final String AUTH_LOGINCTRL 		= "/login";
	public static final String AUTH_LOGOUTCTRL 		= "/logout";
	public static final String MYPAGE_CTRL 			= "/auth/mypage";
	public static final String TEST_LISTDATACTRL 	= "/listdata";
	
	// 기타 설정
	public static final String LOGIN 				= "/";
	
	// URL 생성
	public static String MakeURL(HttpServletRequest request, String URL)
	{
		return BASE_ADDR + request.getContextPath() + URL;
	}
}