package model.dao;

import java.util.List;

import model.entidade.Department;

public interface DepartamentDao {
	
	void isert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
	

}
