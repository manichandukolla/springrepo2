package com.boot.intilizer;

import java.util.Set;

import javax.jws.HandlerChain;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

import com.boot.config.Cofigurer;
@HandlesTypes(value = { Cofigurer.class })
public class MyInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
	
		for(Class<?> d:c) {
			try {
				((Cofigurer) d.newInstance()).configurer(ctx);
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
