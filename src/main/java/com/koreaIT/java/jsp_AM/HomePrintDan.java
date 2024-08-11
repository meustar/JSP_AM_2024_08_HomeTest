package com.koreaIT.java.jsp_AM;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/home/printDan")
public class HomePrintDan extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/jsp/home/printDan.jsp").forward(request, response);
		// 상대경로, 절대경로 찾아보기.
		
		// url로 받은 요청은. servlet 파일이 받고(@WebServlet("/home/printDan")), 이 페이지를 읽고 
		// request.getRequestDispatcher("/jsp/home/printDan.jsp").forward(request, response); 를 만나 다시 jsp 파일로 요청을 보낸다.
	}

}
