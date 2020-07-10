package ch.zli.m233.marlonweiss.multiuserapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ch.zli.m233.marlonweiss.multiuserapp.model.Customer;
import ch.zli.m233.marlonweiss.multiuserapp.model.Memo;
import ch.zli.m233.marlonweiss.multiuserapp.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customer;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customer.findAllCustomer();
	}

	@Override
	public Customer getCustomer(long customerId) {
		// TODO Auto-generated method stub
		return customer.findCustomerByCustomerId(customerId);
	}

	@Override
	public Customer addCustomer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(long customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Memo addMemoToCustomer(long customerId, String memoText) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
