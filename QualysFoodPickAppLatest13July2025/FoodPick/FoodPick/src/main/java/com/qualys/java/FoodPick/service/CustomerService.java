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
		customerRepository.insertCustomer(customer.getCustID(), customer.getCustName(), customer.getCustAddr(),
				customer.getCustPhoneNo());
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

		if (partialCustomer.getCustName() == null) {
			partialCustomer.setCustName(customerName);
			isUpdated = false;
		}

		if (partialCustomer.getCustAddr() == null) {
			partialCustomer.setCustAddr(customerAddress);
			isUpdated = false;
		}
		
		if (partialCustomer.getCustPhoneNo() == 0L) {
			partialCustomer.setCustPhoneNo(customerPhoneNo);
			isUpdated = false;
		}

		if (partialCustomer.getCustName() != null && !partialCustomer.getCustName().equals(customerName)) {
			partialCustomer.getCustName();
			isUpdated = true;
		}

		if (partialCustomer.getCustAddr() != null && !partialCustomer.getCustAddr().equals(customerAddress)) {
			partialCustomer.getCustAddr();
			isUpdated = true;
		}

		if (customerPhoneNo != partialCustomer.getCustPhoneNo() && partialCustomer.getCustPhoneNo() != 0L) {
			partialCustomer.getCustPhoneNo();
			isUpdated = true;
		}

		if (isUpdated) {
			int rows = customerRepository.updatePartDetails(id, partialCustomer.getCustName(), partialCustomer.getCustAddr(), partialCustomer.getCustPhoneNo());
			return rows > 0 ? "Customer partially updated successfully." : "Customer not found.";
		} else {
			return "Nothing to update.";
		}
	}

	private String getExistingName(int id) {
		return customerRepository.findById(id).map(Customer::getCustName).orElse(null);
	}

	private String getExistingAddr(int id) {
		return customerRepository.findById(id).map(Customer::getCustAddr).orElse(null);
	}

	private long getExistingPhoneNo(int id) {
		return customerRepository.findById(id).map(Customer::getCustPhoneNo).orElse(null);
	}
}