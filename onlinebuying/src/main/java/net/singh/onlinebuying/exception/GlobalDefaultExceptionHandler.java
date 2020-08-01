package net.singh.onlinebuying.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("errorTitle","The Page you are looking for is not constructed");
		mv.addObject("errorDescription","The Page you are lookingfor is not available");
		mv.addObject("title","404 error Page");
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("errorTitle","Product not available Fuck off !");
		mv.addObject("errorDescription","The Page you are lookingfor is not available");
		mv.addObject("title","Product Unavailable");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerdException(Exception ex) {
		
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("errorTitle","Insert your Finger In your Cave Contact your Admin");
		mv.addObject("errorDescription",ex.toString());
		mv.addObject("title","Error _|_ ");
		return mv;
	}

}
