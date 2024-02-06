package model.dao;

import java.util.List;

import model.entidade.Seller;

public interface SellerDao {
	
	void isert(Seller obj);
	void update(Seller obj);
	void deleteById(Seller id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
