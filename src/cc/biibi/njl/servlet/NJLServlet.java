package cc.biibi.njl.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.biibi.njl.dao.CustomersDAO;
import cc.biibi.njl.impl.NJLImpl;
import cc.biibi.njl.setget.Customers;

/**
 * Servlet implementation class NJLServlet
 */
@WebServlet("*.html")
public class NJLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//封装数据用对象
	CustomersDAO customersDAO = new NJLImpl();
	
	//默认方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用此方法
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();//获取Servlet路径
		String methodpath = path.substring(1, path.length()-5);//获取网址.之前的字符并且此字符为servlet中的方法
		System.out.println(methodpath);
		try{
			//通过反射获取方法名                              获得私有方法
			Method method = getClass().getDeclaredMethod(methodpath,HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this, request,response);//通过反射调用本类的已有的方法
						  //本类    参数1         参数2
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//写入数据库方法
	@SuppressWarnings("unused")
	private void add(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		//1. 获取表单参数
		request.setCharacterEncoding("utf-8");//设置编码
		String wechat = request.getParameter("wechat");
		String username = request.getParameter("username");
		String mobile = request.getParameter("mobile");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		String orderroom = request.getParameter("orderroom");
		String repast =request.getParameter("repast");
		String remarks = request.getParameter("remarks");

		
		//2. 把表单参数封装为一个Customers对象customer
		Customers customers = new Customers(wechat, username, mobile, startdate, 
										   enddate, orderroom, repast, remarks);
		
		//3. 调用CustomersDAO 的 save(Customer customer) 执行保存操作
		customersDAO.save(customers);
		
		//4. 重定向到thank.jsp 页面
		response.sendRedirect("thank.jsp");
		
		//发送预约确认短信
		customersDAO.IsMobile(mobile);
		
	}
}
