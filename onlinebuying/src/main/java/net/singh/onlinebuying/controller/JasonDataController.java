package net.singh.onlinebuying.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.singh.onlinebuyingBackend.dao.ProductDAO;
import net.singh.onlinebuyingBackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JasonDataController {
	
	
	@Autowired
	private ProductDAO productdao;
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProduct(){
		
		
		return productdao.listActiveProducts();
	}

	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable("id") int id){
		
		
		return productdao.listActiveProductsByCategory(id);
	}
	
	
}
