package com.secondmvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.views.AbstractView;

/**
 * 
 */

/**
 * @author chandu
 *
 */
public class HomeWelcoming extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		return new ModelAndView("home");
	}

	
}    		