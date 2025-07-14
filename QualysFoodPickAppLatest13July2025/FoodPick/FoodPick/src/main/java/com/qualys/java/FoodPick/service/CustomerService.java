package com.qualys.java.FoodPick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualys.java.FoodPick.entity.Customer;
import com.qualys.java.FoodPick.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void saveCustomer(Customer customer) {
		customerRepository.insertCustomer(customer.getCust_id(), customer.getCust_Name(), customer.getCust_Addr(),
				customer.getCust_Phone_No());
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.fetchAllCustomers();
	}

	public String deleteCustomer(int id) {
		int rows = customerRepository.deleteCustomerNative(id);
		return rows > 0 ? "Customer deleted successfully." : "Customer not found.";
	}

	public String updatePartDetails(int id, Customer partialCustomer) {

		// Existing Details of Customer
		String customerName = getExistingName(id);
		String customerAddress = getExistingAddr(id);
		long customerPhoneNo = getExistingPhoneNo(id);

		boolean isUpdated = false;

		if (partialCustomer.getCust_Name() == null) {
			partialCustomer.setCust_Name(customerName);
			isUpdated = false;
		}

		if (partialCustomer.getCust_Addr() == null) {
			partialCustomer.setCust_Addr(customerAddress);
			isUpdated = false;
		}

		if (partialCustomer.getCust_Phone_No() == 0L) {
			partialCustomer.setCust_Phone_No(customerPhoneNo);
			isUpdated = false;
		}

		if (partialCustomer.getCust_Name() != null && !partialCustomer.getCust_Name().equals(customerName)) {
			partialCustomer.getCust_Name();
			isUpdated = true;
		}

		if (partialCustomer.getCust_Addr() != null && !partialCustomer.getCust_Addr().equals(customerAddress)) {
			partialCustomer.getCust_Addr();
			isUpdated = true;
		}

		if (customerPhoneNo != partialCustomer.getCust_Phone_No() && partialCustomer.getCust_Phone_No() != 0L) {
			partialCustomer.getCust_Phone_No();
			isUpdated = true;
		}

		if (isUpdated) {
			int rows = customerRepository.updatePartDetails(id, partialCustomer.getCust_Name(),
					partialCustomer.getCust_Addr(), partialCustomer.getCust_Phone_No());
			return rows > 0 ? "Customer partially updated successfully." : "Customer not found.";
		} else {
			return "Nothing to update.";
		}
	}

	private String getExistingName(int id) {
		return customerRepository.findById(id).map(Customer::getCust_Name).orElse(null);
	}

	private String getExistingAddr(int id) {
		return customerRepository.findById(id).map(Customer::getCust_Addr).orElse(null);
	}

	private long getExistingPhoneNo(int id) {
		return customerRepository.findById(id).map(Customer::getCust_Phone_No).orElse(null);
	}
}