package net.singh.onlinebuyingBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.singh.onlinebuyingBackend.dao.CategoryDao;
import net.singh.onlinebuyingBackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categorydao;
	private Category category;
	
	
	@BeforeClass
	public static void init() {
			
		context=new AnnotationConfigApplicationContext();
		context.scan("net.singh.onlinebuyingBackend");
		context.refresh();
		categorydao=(CategoryDao) context.getBean("categorydao");
		
		
		
	}
//	@Test
//	public void testAddCategory() {
//		
//		category=new Category();
//		category.setName("Television");
//		category.setDiscription("This is a Apple TV");
//		category.setImageURL("cat.png");
//		assertEquals("successfuly added category inside te table",true,categorydao.add(category));
//	}
	
	
//	@Test
//	public void testGetCategory() {
//		
//		category=categorydao.get(1); 
//		assertEquals("successfuly Fetched Data From table","Television",category.getName());
//	}
	
//	@Test
//	public void testUpdateCategory() {
//		
//		category=categorydao.get(1); 
//		category.setName("TV");
//		assertEquals("successfuly Updated Single Category Into the table",true,categorydao.update(category));
//	}
//	
//	@Test
//	public void testDeleteCategory() {
//		
//		category=categorydao.get(1); 
//		//category.setActive(false);
//		assertEquals("successfuly Delete Single Category Into the table set False is_Active",true,categorydao.delete(category));
//	}
//	
//	@Test
//	public void testGetAllCategory() {
//		
//	
//		//category.setActive(false);
//		assertEquals("successfuly selected all active  Category from the table",3,categorydao.list().size());
//	}
	
	
	@Test
	public void testCRUDCategory() {
		
		
		
		
		
	}
	
	
}
