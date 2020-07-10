package ch.zli.m233.marlonweiss.multiuserapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m233.marlonweiss.multiuserapp.model.Customer;
import ch.zli.m233.marlonweiss.multiuserapp.model.CustomerImpl;

public interface CustomerRepository extends JpaRepository<CustomerImpl, Long> {

	public default List<Customer> findAllCustomer() {
		return new ArrayList<Customer>(findAll());
	}

	public Customer findCustomerByName(String customerName);

	public default Customer createCustomer(String customerName) {
		CustomerImpl customerImpl = new CustomerImpl(customerName);
		return save(customerImpl);
	}

	public Customer findCustomerByCustomerId(long customerId);	
}

