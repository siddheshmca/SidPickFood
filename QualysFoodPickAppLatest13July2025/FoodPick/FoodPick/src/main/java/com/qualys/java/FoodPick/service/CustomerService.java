package com.qualys.java.FoodPick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualys.java.FoodPick.DTO.CustomerAddressRequest;
import com.qualys.java.FoodPick.entity.CustAddr;
import com.qualys.java.FoodPick.entity.Customer;
import com.qualys.java.FoodPick.repository.CustAddrRepository;
import com.qualys.java.FoodPick.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustAddrRepository custAddrRepository;

	public void saveCustomerDetails(CustomerAddressRequest customerDetails) {
		customerRepository.insertCustomer(customerDetails.getCust_id(), customerDetails.getCust_Name(),
				customerDetails.getCust_email(), customerDetails.getCust_Phone_No());
	}

	public void saveCustomerAddress(CustomerAddressRequest customerDetails) {
		custAddrRepository.addCustomerAddress(customerDetails.getCust_addr_id(), customerDetails.getCust_id(),
				customerDetails.getCust_flat_num(), customerDetails.getCust_floor_num(), customerDetails.getCust_wing(),
				customerDetails.getCust_bldg_name(), customerDetails.getCust_society_name(),
				customerDetails.getCust_street_name(), customerDetails.getCust_area(), customerDetails.getCust_city(),
				customerDetails.getCust_state(), customerDetails.getCust_pin_code());
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.fetchAllCustomers();
	}

	public List<CustAddr> getCustomerAddress() {
		return custAddrRepository.fetchCustomerAddr();
	}

	public String deleteCustomer(int id) {
		int rows = customerRepository.deleteCustomerNative(id);
		return rows > 0 ? "Customer deleted successfully." : "Customer not found.";
	}
	
	public String deleteCustAddr(int id) {
		int rows = custAddrRepository.deleteCustomerAddress(id);
		return rows > 0 ? "Customer deleted successfully." : "Customer not found.";
	}

	public String updateCustomerDetails(int id, CustomerAddressRequest custUpdate) {

		// Existing Details of Customer
		Customer customer = getCustomerDetails(id).get();

		boolean isUpdated = false;

		if (custUpdate.getCust_Name() == null) {
			custUpdate.setCust_Name(customer.getCust_Name());
			isUpdated = false;
		}

		if (custUpdate.getCust_email() == null) {
			custUpdate.setCust_email(customer.getCust_Email());
			isUpdated = false;
		}

		if (custUpdate.getCust_Phone_No() == 0L) {
			custUpdate.setCust_Phone_No(customer.getCust_Phone_No());
			isUpdated = false;
		}

		if (custUpdate.getCust_Name() != null && !custUpdate.getCust_Name().equals(customer.getCust_Name())) {
			custUpdate.getCust_Name();
			isUpdated = true;
		}

		if (custUpdate.getCust_email() != null && !custUpdate.getCust_email().equals(customer.getCust_Email())) {
			custUpdate.getCust_email();
			isUpdated = true;
		}

		if (customer.getCust_Phone_No() != custUpdate.getCust_Phone_No() && custUpdate.getCust_Phone_No() != 0L) {
			custUpdate.getCust_Phone_No();
			isUpdated = true;
		}

		if (isUpdated) {
			int rows = customerRepository.updateCustomerDetails(id, custUpdate.getCust_Name(),
					custUpdate.getCust_email(), custUpdate.getCust_Phone_No());
			return rows > 0 ? "Customer partially updated successfully." : "Customer not found.";
		} else {
			return "Nothing to update.";
		}
	}

	public String updateCustomerAddress(int id, CustomerAddressRequest custUpdate) {
		CustAddr prevAddr = getCustomerAddress(id).get();

		boolean isUpdated = false;

		if (custUpdate.getCust_area() == null) {
			custUpdate.setCust_area(prevAddr.getCust_area());
			isUpdated = false;
		}
		if (custUpdate.getCust_bldg_name() == null) {
			custUpdate.setCust_bldg_name(prevAddr.getCust_bldg_name());
			isUpdated = false;
		}
		if (custUpdate.getCust_city() == null) {
			custUpdate.setCust_city(prevAddr.getCust_city());
			isUpdated = false;
		}
		if (custUpdate.getCust_flat_num() == 0) {
			custUpdate.setCust_flat_num(prevAddr.getCust_flat_num());
			isUpdated = false;
		}
		if (custUpdate.getCust_floor_num() == 0) {
			custUpdate.setCust_floor_num(prevAddr.getCust_floor_num());
			isUpdated = false;
		}
		if (custUpdate.getCust_pin_code() == 0) {
			custUpdate.setCust_pin_code(prevAddr.getCust_pin_code());
			isUpdated = false;
		}
		if (custUpdate.getCust_society_name() == null) {
			custUpdate.setCust_society_name(prevAddr.getCust_society_name());
			isUpdated = false;
		}
		if (custUpdate.getCust_state() == null) {
			custUpdate.setCust_state(prevAddr.getCust_state());
			isUpdated = false;
		}
		if (custUpdate.getCust_street_name() == null) {
			custUpdate.setCust_street_name(prevAddr.getCust_street_name());
			isUpdated = false;
		}
		if (custUpdate.getCust_wing() == null) {
			custUpdate.setCust_wing(prevAddr.getCust_wing());
			isUpdated = false;
		}

		if (custUpdate.getCust_area() != null && !custUpdate.getCust_area().equals(prevAddr.getCust_area())) {
			custUpdate.getCust_area();
			isUpdated = true;
		}
		if (custUpdate.getCust_bldg_name() != null
				&& !custUpdate.getCust_bldg_name().equals(prevAddr.getCust_bldg_name())) {
			custUpdate.getCust_bldg_name();
			isUpdated = true;
		}
		if (custUpdate.getCust_city() != null && !custUpdate.getCust_city().equals(prevAddr.getCust_city())) {
			custUpdate.getCust_city();
			isUpdated = true;
		}
		if (custUpdate.getCust_flat_num() != 0 && custUpdate.getCust_flat_num() != prevAddr.getCust_flat_num()) {
			custUpdate.getCust_flat_num();
			isUpdated = true;
		}
		if (custUpdate.getCust_floor_num() != 0 && custUpdate.getCust_floor_num() != prevAddr.getCust_floor_num()) {
			custUpdate.getCust_floor_num();
			isUpdated = true;
		}
		if (custUpdate.getCust_pin_code() != 0 && custUpdate.getCust_pin_code() != prevAddr.getCust_pin_code()) {
			custUpdate.getCust_pin_code();
			isUpdated = true;
		}
		if (custUpdate.getCust_society_name() != null
				&& !custUpdate.getCust_society_name().equals(prevAddr.getCust_society_name())) {
			custUpdate.getCust_society_name();
			isUpdated = true;
		}
		if (custUpdate.getCust_state() != null && !custUpdate.getCust_state().equals(prevAddr.getCust_state())) {
			custUpdate.getCust_state();
			isUpdated = true;
		}
		if (custUpdate.getCust_street_name() != null
				&& !custUpdate.getCust_street_name().equals(prevAddr.getCust_street_name())) {
			custUpdate.getCust_street_name();
			isUpdated = true;
		}
		if (custUpdate.getCust_wing() != null && !custUpdate.getCust_wing().equals(prevAddr.getCust_wing())) {
			custUpdate.getCust_wing();
			isUpdated = true;
		}

		if (isUpdated) {
			int rows = custAddrRepository.updateCustomerAddress(id, custUpdate.getCust_flat_num(),
					custUpdate.getCust_floor_num(), custUpdate.getCust_wing(), custUpdate.getCust_bldg_name(),
					custUpdate.getCust_society_name(), custUpdate.getCust_street_name(), custUpdate.getCust_area(),
					custUpdate.getCust_city(), custUpdate.getCust_state(), custUpdate.getCust_pin_code());
			return rows > 0 ? "Customer partially updated successfully." : "Customer not found.";
		} else {
			return "Nothing to update.";
		}

	}

	private Optional<Customer> getCustomerDetails(int id) {
		return customerRepository.findById(id);
	}

	private Optional<CustAddr> getCustomerAddress(int id) {
		return custAddrRepository.findAddrById(id);
	}

}