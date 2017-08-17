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
		
		// 보낼 변수 값 세팅
		//List<PersonModel> li = lds.getListData();
						
		// 변수를 담아서
		request.setAttribute("datadata", lds.getListData());
		
		// 지정된 뷰에 실어 보낸다
		request.getRequestDispatcher("/WEB-INF/view/test/listdata.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		System.out.println("doPost");
	}
}
