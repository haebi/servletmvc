package com.haebi.test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.haebi.test.model.PersonModel;
import com.haebi.test.service.ListDataService;

@WebServlet("/listdata")
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
		
		// ���� ���� �� ����
		//List<PersonModel> li = lds.getListData();
						
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
