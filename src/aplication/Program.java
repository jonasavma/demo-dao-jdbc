package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entidade.Department;
import model.entidade.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== Test 1:seller findById");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("====== Test 2:seller findByDepartment ==========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {

			System.out.println(obj);

		}

		System.out.println("====== Test 3 :seller findByAll ==========");
		list = sellerDao.findAll();

		for (Seller obj : list) {

			System.out.println(obj);

		}

		System.out.println("====== Test 4 :seller insert ==========");

		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com.br", new Date(), 4000.00, department);

		sellerDao.isert(newSeller);
		System.out.println("Inserted! New id =" + newSeller.getId());
		
		System.out.println("====== Test  :seller update ==========");
		seller = sellerDao.findById(1);
		
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed !");
		

	}

}
