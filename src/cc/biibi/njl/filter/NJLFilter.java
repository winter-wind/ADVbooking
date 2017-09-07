/*
package cc.biibi.njl.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/add.html")
public class NJLFilter extends HttpFilter{
       
	private static final long serialVersionUID = 1L;


	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");//设置编码
		String username = request.getParameter("username");
		String mobile = request.getParameter("mobile");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		
		String regname = "[^x00-xff]{2,5}+";//匹配中文
		String regmobile = "\\d{11}";//匹配手机号
		String regstartdate = "\\d{4}-\\d{2}-\\d{2}";
		String regenddate = "\\d{4}-\\d{2}-\\d{2}";
		if(!(username.matches(regname))){
			System.out.println("姓名输入有误");
		}else if(!(mobile.matches(regmobile))){
			System.out.println("手机号输入有误");
		}else if(!(startdate.matches(regstartdate))){
			System.out.println("开始日期输入有误");
		}else if(!(enddate.matches(regenddate))){
			System.out.println("结束日期有误");
		}else{
			System.out.println("这是一个拦截器");
			chain.doFilter(request, response);
		}
		
		
	}

	
	

}
*/