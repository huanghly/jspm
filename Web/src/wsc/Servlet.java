package wsc;

import wsc.Class.Limit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 模拟传感器的数据传输 数据结构：01020304
		String data = request.getParameter("data");
		Limit lt = new Limit();
		String id = null;
		String name = null;
		String limit = null;
		String value = null;
		if(data != null){
			lt.setId(Integer.parseInt(data.substring(0,2)));
			lt.setLimit(data.substring(2,4));
			lt.setName(data.substring(4,6));
			lt.setValue(data.substring(6));
		}
		PrintWriter out = response.getWriter();
		//如果有必要可以返回值
		out.println(7);

	}
}
