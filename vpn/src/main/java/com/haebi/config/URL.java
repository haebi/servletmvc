/*
 * sendRedirect ȣ�� ��
 * response.sendRedirect(URL.MakeURL(request, URL.LOGIN));
 * 
 * BASE_ADDR ���� �ȳ�
 * Tomcat �ܵ� �̿� �� : "" ���� �����մϴ�.
 * Nginx ���Ͻ� �̿� �� : Nginx ���Ͻ� �� ������ ��� �� �Է��մϴ�.
 * - ��) Nginx ���Ͻ� ������ /wa ��, /wa �ϴ��� ��� ������ tomcat ���� �������� ���,
 *      WAS ���� �ν��ϴ� request.getContextPath() �� /vpn �̶�� �����ϸ� ���� ��δ� http://domain/wa/vpn �� �˴ϴ�.
 *      �׷���, request.getContextPath() �� �������� ��δ� tomcat �ڽ� �������� ���� ��ġ�� ���Ͽ� http://domain/vpn �� �Ǿ�����ϴ�.
 *      �� ������ �ذ��ϱ� ���� BASE_ADDR�� ���Ͽ� �� ���̸� �����մϴ�.
*/

package com.haebi.config;

import javax.servlet.http.HttpServletRequest;

public class URL {
	// �⺻ �ּ�
	public static final String BASE_ADDR			= "";	// tomcat �ܵ� �̿�� "" ���� �����մϴ�. | Nginx ���Ͻ� �̿� �� ���Ͻ� ���� ��θ� �Է��մϴ�. "/wa"
	
	// ���� ����
	public static final String AUTH_AUTHFILTER 		= "/auth/*";
	
	// ���� ����
	public static final String AUTH_LOGINCTRL 		= "/login";
	public static final String AUTH_LOGOUTCTRL 		= "/logout";
	public static final String MYPAGE_CTRL 			= "/auth/mypage";
	public static final String TEST_LISTDATACTRL 	= "/listdata";
	
	// ��Ÿ ����
	public static final String LOGIN 				= "/";
	
	// URL ����
	public static String MakeURL(HttpServletRequest request, String URL)
	{
		return BASE_ADDR + request.getContextPath() + URL;
	}
}