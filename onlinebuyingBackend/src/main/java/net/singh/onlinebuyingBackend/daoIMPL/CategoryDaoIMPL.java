package net.singh.onlinebuyingBackend.daoIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.singh.onlinebuyingBackend.dao.CategoryDao;
import net.singh.onlinebuyingBackend.dto.Category;

@Repository("categorydao")
@Transactional
public class CategoryDaoIMPL implements CategoryDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Category> list() {
	
		String selectActive="FROM Category WHERE active=:active";
		Query query=sessionfactory.getCurrentSession().createQuery(selectActive);
		query.setParameter("active",true);
		return query.getResultList();
		
		
	}

	/*
	 * Getting a Single Category by Based on ID
	 * 
	 */
	@Override
	public Category get(int id) {

		return sessionfactory.getCurrentSession().get(Category.class, Integer.valueOf(id));

	}

	@Override
	public boolean add(Category category) {

		try {
			sessionfactory.getCurrentSession().persist(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}
	
/*
 * Update a Single Category
 * */
	@Override
	public boolean update(Category category) {
		try {
			sessionfactory.getCurrentSession().update(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionfactory.getCurrentSession().update(category);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	
	}

}
