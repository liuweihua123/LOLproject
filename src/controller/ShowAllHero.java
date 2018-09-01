package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.org.mozilla.javascript.internal.json.JsonParser;

import model.Hero;
import model.HeroDao;

public class ShowAllHero extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HeroDao hd=new HeroDao();
		List<Hero> lists=hd.queryALLHero();
		
		StringBuffer sb=new StringBuffer();
		sb.append("<table align='center' border='1' cellspacing='0'>\r\n");
		sb.append("<tr><td>id</td><td>英雄姓名</td><td>血条值</td><td>伤害值</td><td>edit</td><td>delete</td><td>Add</td></tr>\r\n");

		String trFormat = "<tr><td>%d</td><td>%s</td><td>%f</td><td>%d</td><td><a href='updateHero.jsp?id=%d'>edit</a></td><td><a href='deleteHero.jsp?id=%d'>delete</a></td><td><a href='AddHero.jsp?id=%d'>add</a></td></tr>\r\n";

		for (Hero hero : lists) {
			String tr = String.format(trFormat, hero.getId(), hero.getName(), hero.getXietiao(), hero.getDamage(),hero.getId(),hero.getId(),hero.getId());
			
			sb.append(tr);
		}

		sb.append("</table>");

		response.getWriter().write(sb.toString());
		
		
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
