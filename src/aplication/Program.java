package aplication;



import java.util.Date;

import model.Department;
import model.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1,"Books");
		
		Seller seller=new Seller(21,"Bob","bob@gmail.com",new Date(),30000.00,obj);
		
		System.out.println(seller);
		
		
		
	}

}
