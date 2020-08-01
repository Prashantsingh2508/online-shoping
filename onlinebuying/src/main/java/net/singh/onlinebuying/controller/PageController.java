package net.singh.onlinebuying.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.singh.onlinebuying.exception.ProductNotFoundException;
import net.singh.onlinebuyingBackend.dao.CategoryDao;
import net.singh.onlinebuyingBackend.dao.ProductDAO;
import net.singh.onlinebuyingBackend.dto.Category;
import net.singh.onlinebuyingBackend.dto.Product;



@Controller
public class PageController {
	private static final Logger logger=LoggerFactory.getLogger(PageController.class);
	
	@Autowired
	private CategoryDao categorydao;
	@Autowired
	private ProductDAO productdao;
	
	
	
	
		//private ModelAndView mv;
		@RequestMapping(value = {"/","/home","/index"})
		
		public ModelAndView index() {
			ModelAndView	mv=new ModelAndView("page");
			
			mv.addObject("title","home");
			logger.info("Inside the PageController Index Method -INFO");
			logger.debug("Inside the PageController Index Method - DEBUG"); 
			// Passing the List Of Categories
			mv.addObject("categories",categorydao.list());
			mv.addObject("userClickHome",true);
			return mv;
			
		}
		
@RequestMapping(value = "/about")
		
		public ModelAndView about() {
	ModelAndView	mv=new ModelAndView("page");
			
			mv.addObject("title","About us");
			mv.addObject("userClickAbout",true);
			return mv;
			
		}
@RequestMapping(value ="/contact")

public ModelAndView contact() {
	ModelAndView	mv=new ModelAndView("page");
	
	mv.addObject("title","Contact us");
	mv.addObject("userClickContact",true);
	return mv;
}


	/*
	 * Methods to Load All Products based on category
	 *  
	 * */

@RequestMapping(value = "/listofproducts")

public ModelAndView showAllProducts() {
	ModelAndView mv=new ModelAndView("page");
	
	mv.addObject("title","ListOfProducts");
	// Passing the List Of Categories
	mv.addObject("categories",categorydao.list());
	mv.addObject("userClickAllProducts",true);
	return mv;
	
}

@RequestMapping(value = "/{id}/listofproducts")

public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
	ModelAndView mv=new ModelAndView("page");
	
	Category category=null;
	category= categorydao.get(id);
	
	
	mv.addObject("title",category.getName());
	// Passing the List Of Categories
	mv.addObject("categories",categorydao.list());
	// passing only single category
	
	mv.addObject("category",category);
	mv.addObject("userClickCategoryProducts",true);
	return mv;
	
}
/*
 * Viewing a single Product
 * 
 *
 * */

@RequestMapping(value = "/show/{id}/listofproducts")

public ModelAndView showSingleProducts(@PathVariable("id") int id)throws ProductNotFoundException{
	ModelAndView mv=new ModelAndView("page");
	
	Product product=productdao.get(id);
	if(product==null)throw new ProductNotFoundException();
	//update The View count
	product.setViews(product.getViews()+1);
	productdao.update(product);
	
	mv.addObject("title",product.getName());
	mv.addObject("product",product);
	mv.addObject("userClickShowProduct",true);
	
	return mv;
	
}


}
