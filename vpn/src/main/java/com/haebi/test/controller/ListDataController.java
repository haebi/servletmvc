package com.haebi.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haebi.config.URL;
import com.haebi.test.service.ListDataService;

@WebServlet(URL.TEST_LISTDATACTRL)
public class ListDataController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7753965989577474315L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doGet");
		
		ListDataService lds = new ListDataService();
						
		// ������ ��Ƽ�
		request.setAttribute("datadata", lds.getListData());
		
		// ������ �信 �Ǿ� ������
		request.getRequestDispatcher("/WEB-INF/view/test/listdata.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost");
	}
}
