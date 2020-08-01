package net.singh.onlinebuyingBackend.dao;

import java.util.List;

import net.singh.onlinebuyingBackend.dto.Category;

public interface CategoryDao {
	
	
	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
}
