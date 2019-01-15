package com.sun.lds;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/1/10.
 */
public class MyHttpServlet extends HttpServlet {
	
	@Override
	protected void doGet( HttpServletRequest req, HttpServletResponse resp) throws
										ServletException,
										IOException {
		
		/**
		 * 告知浏览器用什么编码解析
		 */
		//resp.setContentType ("text/html;charset=UTF-8");
		/**
		 * 设置返回内容编码
		 */
		resp.getWriter ().write ("wojiaolds 刘灯松");
	}
}
