package com.koreaIT.java.jsp_AM;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/printDan")
public class PrintDanServlet extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset:UTF-8");
		
		String inputedDan = request.getParameter("dan");
		String inputedLimit = request.getParameter("limit");
		String inputedColor = request.getParameter("color");
		if (inputedDan == null) {
			inputedDan = "1";
		}
		
		if (inputedLimit == null) {
			inputedLimit = "1";
		}
		
		int dan = Integer.parseInt(inputedDan);
		//http://localhost:8080/JSP_AM_2024_08_test/printDan?dan=9
		int limit = Integer.parseInt(inputedLimit);
		//http://localhost:8080/JSP_AM_2024_08_test/printDan?dan=9&limit=5
		
		// 줄바꿈하려면 HTML <br>를 쓰거나, <div></div>로 감싸야 한다.
//		response.getWriter().append(String.format("== %d단 ==<br>", dan));
		response.getWriter().append(String.format("<div style='color: %s;'>== %d단 ==</div>",inputedColor, dan));
		
		for(int i = 1; i <= limit; i++) {
			response.getWriter().append(String.format("<div style='color: %s;'>d * %d = %d</div>", inputedColor, dan, i, dan*i));
			
		}
	}

}
