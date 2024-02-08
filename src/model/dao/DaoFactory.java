package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConection());
	}

	public static DepartamentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConection());
	}

}
