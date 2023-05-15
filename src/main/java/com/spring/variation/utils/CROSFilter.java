package com.spring.variation.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
* 
* @ClassName:  CorsFilter   
* @Description: SpringBoot 跨域处理拦截器
*/
@Component
public class CROSFilter implements Filter {
	public static final Logger logger = LoggerFactory.getLogger(CROSFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;  
		  
       HttpServletRequest reqs = (HttpServletRequest) req;  
       //response.setHeader("Access-Control-Allow-Origin","http://bioinformatics.hit.edu.cn/");
       response.setHeader("Access-Control-Allow-Origin","*");
       response.setHeader("Access-Control-Allow-Credentials", "true");  
       response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");  
       response.setHeader("Access-Control-Max-Age", "3600");  
       response.setHeader("Access-Control-Allow-Headers", "Content-Type,x-token");   
       if (((HttpServletRequest) req).getMethod().equals("OPTIONS")) {
           response.getWriter().println("ok");
           return;
       }

       chain.doFilter(req, res);  
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}