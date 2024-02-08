package aplication;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entidade.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartamentDao departamentDao = DaoFactory.createDepartmentDao();

		System.out.println("======Test 1: findById ================== ");
		Department department = departamentDao.findById(7);
		System.out.println(department);
		
		System.out.println("======Test 2: findById findByDepartment================== ");

		System.out.println("======Test 3 : Departament Insert ================== ");
		Department newDepartment = new Department(null, "Estudos");
		departamentDao.isert(newDepartment);

		System.out.println("Inserted new id =" + newDepartment.getId());
		
		System.out.println("====== Test  :Departament update ==========");

	}

}
