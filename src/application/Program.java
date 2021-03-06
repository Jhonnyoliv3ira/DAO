package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("FINDBYID TEST 1");
		Seller seller = sellerDao.findById(3);
		
		System.out.println("TEST 2 FINDBYDEPARTMENTE");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj:list) {
			System.out.println(obj);
		}
		
	}

}
