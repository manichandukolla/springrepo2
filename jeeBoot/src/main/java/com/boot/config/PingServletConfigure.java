package com.boot.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import com.boot.servlet.PingServlet;

public class PingServletConfigure implements Cofigurer {

	@Override
	public void configurer(ServletContext context) {
		PingServlet pingServlet =null;
		 ServletRegistration.Dynamic dy=null;
		  pingServlet =new PingServlet();
		  dy=context.addServlet("ping", pingServlet);
		  dy.setLoadOnStartup(1);
			
		  dy.addMapping("/ping");
		
		
		
	}

}
