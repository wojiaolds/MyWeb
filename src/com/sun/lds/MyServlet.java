package com.sun.lds;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>注释</p>
 *
 * @author lds
 * @version $Id: MyServlet.java , v 0.1 2019/1/8 17:05 By lds Edit  $$
 */
public class MyServlet implements Servlet {
	
	private ServletConfig con;
	
	/**
	 * init方法只会被调用一次，这个类只会被初始化一次
	 * tomcat会传递ServletConfig这个对象
	 */
	@Override
	public void init ( ServletConfig servletConfig ) throws ServletException {
		con = servletConfig;
		System.out.println("OneServlet被初始化了"+con);
	}
	
	/**
	 * 获取这个OneServlet的配置信息
	 * 由程序员调用，
	 */
	@Override
	public ServletConfig getServletConfig () {
		System.out.println("获取OneServlet配置信息"+con);
		return con;
	}
	
	/**
	 * 只用户每一次向这个servlet发出request请求时,
	 * 被service接收到时，就会调用这个方法
	 *
	 */
	@Override
	public void service (
		ServletRequest servletRequest, ServletResponse servletResponse )
	throws ServletException, IOException {
		PrintWriter printWriter = servletResponse.getWriter ();
		/**
		 * 告知浏览器用什么编码解析
		 */
		servletResponse.setContentType ("text/html;charset=UTF-8");
		/**
		 * 设置返回内容编码
		 */
		printWriter.write ("wojiaolds 刘灯松");
		System.out.println("用户请求信息："+servletRequest+"服务器返回信息："+servletResponse);
	}
	
	public void doPost(){
	
	}
	/**
	 * 返回自己叫什么名
	 */
	@Override
	public String getServletInfo () {
		
		return "MyServlet";
	}
	
	/**
	 * 当tomcat正常停止时，tomcat先会终止所有service的对象
	 * 就会调用所有servlet的destotry方法
	 */
	@Override
	public void destroy () {
		System.out.println("停止servlet"+this);
	}
}
