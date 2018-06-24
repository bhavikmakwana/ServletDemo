package com.sahajtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(description = "This is the Welcome Servlet", 
	urlPatterns = { "/welcome" }, 
	initParams= {
			@WebInitParam (name="ConfigParam1",value="This is config param value !!"),
			@WebInitParam (name="ConfigParam2",value="This is config param value new !!")
			})

/*
 * more then one servlet config param
 * 
 * */
public class Welcome extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public String param1;
	public String param2;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("This is destroy !!");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is getServletInfo !!");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("This is init ServletConfig  -> "+config.getInitParameter("name"));
		param1 = config.getInitParameter("ConfigParam1");
		param2 = config.getInitParameter("ConfigParam2");	
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is init Service   -> req = "+req +"res -> "+res);
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("Welcome "+name);
		out.println("This Config value -> "+getServletConfig());
		out.println("Param1 -> "+param1);
		out.println("Param2 -> "+param2);
		
	}
}
