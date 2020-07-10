package ch.zli.m233.marlonweiss.multiuserapp.service;

import java.util.List;

import ch.zli.m233.marlonweiss.multiuserapp.model.Customer;
import ch.zli.m233.marlonweiss.multiuserapp.model.Memo;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	
	Customer getCustomer(long customerId);
	
	Customer addCustomer(String name);
	
	void deleteCustomer(long customerId);
	
	Memo addMemoToCustomer(long customerId, String memoText);
}
