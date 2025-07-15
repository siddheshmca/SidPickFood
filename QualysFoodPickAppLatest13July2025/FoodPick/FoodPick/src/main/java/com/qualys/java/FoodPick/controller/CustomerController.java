package com.qualys.java.FoodPick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qualys.java.FoodPick.DTO.CustomerAddressRequest;
import com.qualys.java.FoodPick.IdGenerator.GenerateIdImpl;
import com.qualys.java.FoodPick.entity.CustAddr;
import com.qualys.java.FoodPick.entity.Customer;
import com.qualys.java.FoodPick.service.CustomerService;

@RestController
@RequestMapping("/foodpick/customers")
public class CustomerController {

	@Autowired(required = true)
	public GenerateIdImpl genId;

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<String> createCustomer(@RequestBody CustomerAddressRequest customerCreation) {
		customerCreation.setCust_id(genId.generateId());
		customerCreation.setCust_addr_id(genId.generateId());
		customerService.saveCustomerDetails(customerCreation);
		customerService.saveCustomerAddress(customerCreation);
		return ResponseEntity.ok("Done");
	}

	@RequestMapping(value = "/custDetails", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		return ResponseEntity.ok(customers);
	}

	@RequestMapping(value = "/custAddrDetails", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CustAddr>> getCustomerAddr() {
		List<CustAddr> customerAddress = customerService.getCustomerAddress();
		return ResponseEntity.ok(customerAddress);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		String custAddrDel = customerService.deleteCustAddr(id);
		String custDel = customerService.deleteCustomer(id);
		if (custDel.contains("successfully") && custAddrDel.contains("successfully")) {
			return ResponseEntity.ok(custDel + custAddrDel);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "detChng/{id}", method = RequestMethod.PATCH, consumes = "application/json")
	public ResponseEntity<String> updateCustomerDetails(@PathVariable int id,
			@RequestBody CustomerAddressRequest customerCreation) {
		String message = customerService.updateCustomerDetails(id, customerCreation);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(value = "addrChng/{id}", method = RequestMethod.PATCH, consumes = "application/json")
	public ResponseEntity<String> updateCustomerAddress(@PathVariable int id,
			@RequestBody CustomerAddressRequest customerCreation) {
		String message = customerService.updateCustomerAddress(id, customerCreation);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}