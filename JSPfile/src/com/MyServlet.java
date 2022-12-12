package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String jspBlogId=req.getParameter("jspBlogId");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		resp.setHeader("pragma", "No-cache");
		resp.setDateHeader("Expires", 0);
		resp.setHeader("Cache-Control", "no-cache");
		if(jspBlogId.equals("0")){
			resp.sendRedirect("../doker.jsp");
			//out.print(000);
		}else if(jspBlogId.equals("1")){
			resp.sendRedirect("../blog.jsp");
		}else if(jspBlogId.equals("2")){
			resp.sendRedirect("../qndxx.jsp");
		}else{
			out.print("false");
		}
		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		super.doPost(req, resp);
	}

}
