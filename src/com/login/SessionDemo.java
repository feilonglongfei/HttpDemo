package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SessionDemo extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void method(){
		System.out.println("this is servlet method ....");
	}
	
	public void hello(){
		System.out.println("this is servlet hello ....");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println(arg0.getAttributeNames());
		super.service(arg0, arg1);
		System.out.println("this is servlet service ....");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doGet(req, resp);
		System.out.println("this is servlet doGet ....");
		System.out.println(req.getMethod());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println(req.getSession().getId());
		System.out.println(req.getQueryString());
		System.out.println(req.getParameter("selectedID"));
		System.out.println(req.getParameter("hidden1"));
		System.out.println(req.getParameter("name"));
		System.out.println(req.getSession().getAttribute("sessionAttr1"));
		Cookie[] cookies = req.getCookies();
		
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ";" + cookie.getValue() + ";" + cookie.getComment());
		}
		
		System.out.println(req.getSession().getAttribute("user"));
		
		resp.sendRedirect("secondPage.html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		super.doPost(req, resp);
		System.out.println("this is servlet doPost ....");
		System.out.println(req.getMethod());
		System.out.println(req.getQueryString());
		System.out.println(req.getParameter("selectedID"));
		System.out.println(req.getParameter("hidden1"));
		System.out.println(req.getParameter("name"));
		
		req.setAttribute("attr1", "attr1Value");
		req.setAttribute("attr2", "attr2Value");
		
		System.out.println(req.getSession().getAttribute("sessionAttr1"));
		req.getSession().setAttribute("user", "userName");
		Cookie[] cookies = req.getCookies();
		
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ";" + cookie.getValue() + ";" + cookie.getComment());
		}
		resp.addCookie(new Cookie("productID", "cookievalueForProduceID"));
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("session.jsp"); 
		
		dispatcher.forward(req, resp); 
		
	}
}
